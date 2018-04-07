---
layout: post
title: Hardlink vs Softlink/Symbolic link
---

## Softlink

A softlink(or symbolic link) is just a file that points to another
file. It's a label. This allows symlinks to cross networks and
resources, as there is no relation between the symlink and it's
destination, the OS just knows how to interpret the label and follow
the map to where the source is. This means symlinks can die if the
location they point to is unavailable. On windows the only form of
softlinks are .lnk files, making hardlinks preferable for
integration(explorer.exe understands .lnk files, others don't)

{% highlight text %}
symlink  realfile
[ ] -----> [x]
{% endhighlight %}

## Hardlink

A hardlink happens at the filesystem level, it has 2 file locations
point to the same node that contains the file content. As it is
implemented at the filesystem level, it cannot cross networks or
resources, it is limited to the same filesystem (I'm unsure if most
filesystems have the concept of 'foreign' nodes). The default mode can
be considered single reference hardlinks. Another limitation of
hardlinks is they can't operate on a directory level(a 'node' is a
file content concept).


{% highlight text %}
hardlink (normal)
file      node
[ ] -----> [x]

# hardlink (dual reference)
file      node        file
[ ] -----> [x] <----- [ ]
{% endhighlight %}
