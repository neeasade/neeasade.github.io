#!/bin/sh

cd "$(dirname $([ -L $0  ] && readlink -f $0 || echo $0))"
set -e

elisp "(ns/blog-generate)"

rm -rf /tmp/notes.neeasade.net
cp -r site /tmp/notes.neeasade.net

git checkout master
rm -rf *
cp -r /tmp/notes.neeasade.net/* ./

git add --all
git commit -m "auto commit publish.sh"
git push origin master
git checkout source
