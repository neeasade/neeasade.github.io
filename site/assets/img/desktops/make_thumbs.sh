#!/bin/sh

cd $(dirname $([ -L $0  ] && readlink -f $0 || echo $0))

sed -i "/{{{.*/d" "../../../../pages/rice.org"

find full -type f | sort | tac | while read -r file; do
  filename="$(basename "$file")"
  if [ ! -f "thumb/$filename" ]; then
      echo $filename
      convert "$file" -resize 900x -filter Lanczos "thumb/$filename"
  fi
done
