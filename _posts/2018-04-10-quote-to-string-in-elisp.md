---
layout: post
title: quote to string in elisp
---

I always forget how to do this:

{% highlight elisp %}
(progn 'asdf)
    ;;; => asdf
{% endhighlight %}

When I want the string "asdf". Fix:

{% highlight elisp %}
(progn (print1-to-string 'asdf))
    ;;; => "asdf"
{% endhighlight %}