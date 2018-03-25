---
layout: post
title: Pok3r Mapping
---

Mapping reference that I'm using on my pok3r keyboard.

To map a key:

- switch to desired layer with `fn + {<,>,?}`. 
- `fn + R_Ctrl` to enter programming mode
- enter key you want to remap 
- enter key you want to map to
- `pn` to map
- `fn + R_Ctrl` to exit

You can continue mapping in programming mode by hitting key combinations followed by `pn`. 

## Swaps

{% highlight text %}
esc -> fn + esc
fn + esc -> esc

l_meta -> l_super 
l_super -> l_meta

\ -> backspace
backspace -> \

capslock -> left ctrl
left ctrl -> capslock
{% endhighlight %}

## R_Ctrl -> Fn

note: this effects only the layer you are on, fn transforms into super after this.

- unplug keyboard, flip switch 4 
- hit fn, then r_ctrl
- hit pn, pn to keep position
- turn off switch 4

and now we can have nice vim-like arrow keys:

{% highlight text %}
fn + h -> fn + j
fn + j -> fn + k
fn + k -> fn + i
fn + l -> fn + l
{% endhighlight %}

swap (the now available) right win alt:

{% highlight text %}
r_meta -> r_super 
r_super -> r_meta
{% endhighlight %}

When away, here is an autohotkey script to achieve the same (minus the arrow keys):

{% highlight ahk %}
#SingleInstance force

Capslock::Ctrl

\::Backspace
Backspace::\

+BS::
 KeyWait, Shift
  Send, {|}
Return

LWin::LAlt
LAlt::LWin

RWin::RAlt
RAlt::RWin
{% endhighlight %}
