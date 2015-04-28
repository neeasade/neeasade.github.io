---
layout: post
title: i3-like multihead in bspwm
---

i3 has fantastic focus and window handling for multiple monitors out of the box in my opinion. I didn't realize that I missed this until I was on campus and used i3 on a multihead setup there, so I set out to make my bspwm setup act the same.

##Initial
In the example sxhkd in the bspwm repo, the main window focus keybind is set up as such:

{% highlight bash %}
super + {_,shift + }{h,j,k,l}
    bspc window -{f,s} {left,down,up,right}
{% endhighlight %}

I'm going to separate this into 2 parts, a focus part and a movement part.

##Focus

So taking the focus part out of the above we get:
{% highlight bash %}
super + {h,j,k,l}
    bspc window -f {left,down,up,right}
{% endhighlight %}

So, This will focus on a window in a direction determined by keypress, which are vi-like here. However, lets say you have 2 monitors, and one is empty:

![img](http://i.imgur.com/5VBlIjn.png)

the command `bspc window -f right` will fail, as there is no window to the right, and no action occurs as a result.


###Desired behavior

In the above, on a focus right, I want the cursor to appear in the middle of the right monitor as well as focus on that monitor.

{% highlight bash %}
super +  {h,j,k,l}
    bspc config pointer_follows_monitor true; \
    bspc config pointer_follows_focus true; \
    dir={left,down,up,right}; \
        if ! bspc window -f $dir; then \
    bspc monitor -f $dir; \
    fi; \
    bspc config pointer_follows_monitor false; \
    bspc config pointer_follows_focus false
{% endhighlight %}

When the window right command fails in the above scenario, the monitor to the right will be focused, and the pointer will be there.

\>Why is half of this function setting pointer_follows_* values?

So let's say you are moving a floating window with your mouse across the 2 screens - with either of the two pointer options above enabled, when you cross the border the cursor will move, and the window with it. This window snapping out from under you can be quite annoying.

##Movement

Movement part of the example sxhkd:

{% highlight bash %}
super + shift + {h,j,k,l}
    bspc window -s {left,down,up,right}
{% endhighlight %}

Alright, so what this does is switch the currently focused window with another window by direction, although the focus remains on the original window spot, which I've found to be quite annoying. It feels more natural to keep focus on the same window and 'carry' it around your workspaces/monitors.

###Desired behavior

When a window is switched, retain focus on the original window that was moved. If switching to an empty monitor, move the window to that monitor. If switching to an occupied monitor, move the window to that monitor instead of switching windows.

Under this behavior, the keypress `super + shift + l` would yield the following results:

![img](http://i.imgur.com/ofjhFSP.png)
![img](http://i.imgur.com/HyahZTU.png)

Here is an implementation:
{% highlight bash %}
super + shift + {h,j,k,l}
    bspc config pointer_follows_focus true; \
    cur_win=$(bspc query -W -w) \
    cur_mon=$(bspc query -M -m); \
    dir={left,down,up,right}; \
    if ! bspc window -f $dir; then \
        bspc window -m $dir; \
        bspc monitor -f $dir; \
    else \
        new_mon=$(bspc query -M -m); \
        if [ $new_mon -eq $cur_mon ]; then \
            bspc window -s $cur_win; \
        else \
            bspc window $cur_win -m ^$new_mon; \
        fi; \
    bspc window -f $cur_win; \
    fi; \
    bspc config pointer_follows_focus false
{% endhighlight %}

You can see from this I used the same strategy as above - check if the window focus command failed and act accordingly - if it does not fail, then check if we are on a new monitor - if so, move the original window to the new monitor.

wooo.

