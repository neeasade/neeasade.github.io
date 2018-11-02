

#+title: git svn workflow


Git provides an [svn-wrapper][1], allowing you to use git tools and keep
your decentralized workflow even when you aren't.

The following commands are effected:

|git | git svn|
|----|---------|
|git pull | git svn fetch <br> git svn merge|
|git push | git svn dcommit|
|git clone | git svn clone|

If you are a [magit][3] user, you can install [magit-svn][2].
To enable magit-svn globally (magit will still work find with git repos):

{% highlight elisp %}
  (add-hook 'magit-mode-hook 'magit-svn-mode)
{% endhighlight %}

To enable magit-svn on a per-repo basis:

{% highlight bash %}
    cd /path/to/repository
    git config --add magit.extension svn
{% endhighlight %}

[1]: https://git-scm.com/docs/git-svn
[2]: https://github.com/magit/magit-svn
[3]: https://magit.vc/

