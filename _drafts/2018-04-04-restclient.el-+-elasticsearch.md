---
layout: post
title: restclient.el + elasticsearch
---

`restclient.el` is an emacs plugin that transforms a buffer into a
repl-like curl-backed experience (similar to kibana). It has support
for variables set with arbitrary elisp, turning it into a viable
postman replacement (with plain text! and versioning!). I find this to
be a very nice way to store and execute elasticsearch queries, but
unfortunately you lose autocomplete of ES specific items.
Alternatively, [es-mode][1] exists, which is more ES specific but much
more featureful.

Here is a starter point showing some of restclients capabilities and
how one might use it with elasticsearch:

{% highlight txt %}
;; -*- mode: restclient -*-

# local
:target = http://localhost:9200
:cloud-auth = ""
# Basic http auth example:
cloud-auth := (concat "Basic " (base64-encode-string "username:password"))
:prefix = some_prefix

# multiline variable
:headers = <<
content-type: application/json
Authorization: :cloud-auth
#

# note: there must be a comment to separate request definitions.

# list indices
GET :target/_cat/indices
:headers

# logs sorted by a field
GET :target/:prefix_log/_search
:headers
{
  "sort": [
    {
      "timestamp": {
        "order": "desc"
      }
    }
  ]
}

{% endhighlight %}

and a screenshot of it in action: (todo)

[1]: https://github.com/dakrone/es-mode
