#!/bin/sh

cd $(dirname $([ -L $0  ] && readlink -f $0 || echo $0))

echo -n title: 
read title

file="_drafts/$(date +'%Y-%M-%d')-$(echo $title | sed 's/ /-/g').md"
cat <<EOF >> "$file"
---
layout: post
title: $title
---

Write something.
EOF
