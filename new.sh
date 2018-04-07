#!/bin/sh

cd $(dirname $([ -L $0  ] && readlink -f $0 || echo $0))

if [ -z "$@" ]; then 
  echo -n title: 
  read title
else
  title="$*"
fi

file="./_drafts/$(date +'%Y-%m-%d')-$(echo $title | sed 's/ /-/g').md"
echo writing to $file

cat <<EOF >> "$file"
---
layout: post
title: $title
---

Write something.
EOF

$EDITOR "$file"
