

#+title: curl exit code 60 on Windows


Many times the `curl` tool version available to you on windows is
outdated and doesn't ship with up to date ca certs. A workaround for
this is to grab the latest `cacert.pem` from curl [here][1] in the same
location as curl, and rename it to `curl-ca-bundle.crt`. Thanks to
[Cheeso][2] for the solution. I ran into this while trying to use
`emacs-request` on windows.

[1]: http://curl.haxx.se/docs/caextract.html
[2]: https://superuser.com/questions/442793/why-cant-curl-properly-verify-a-certificate-on-windows


