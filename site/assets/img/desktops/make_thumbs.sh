#!/bin/sh

cd $(dirname $([ -L $0  ] && readlink -f $0 || echo $0))

sed -i "/{{{.*/d" "../../../../pages/rice.org"

for file in $(find full -type f | sort); do
  filename="$(basename $file)"
  [ ! -f "thumb/$filename" ] && \
      convert "$file" -resize 900x -filter Lanczos "thumb/$filename"

  echo "{{{dtop($filename)}}}" >> "../../../../pages/rice.org"
done
