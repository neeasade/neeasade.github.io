#!/bin/sh
# generate and commit the site

cd "$(dirname $([ -L $0  ] && readlink -f $0 || echo $0))"
set -e

clean_tree=$(iif 'git status | grep -q "working tree clean"')

set -x

if ! $clean_tree; then
    git stash
fi

# emacs in batch mode doesn't include font-locking, so everything is broken.
# elisp -b "(progn (ns/core) (ns/extra) (ns/development) (ns/style) (ns/blog-generate))"
# elisp -w "(progn (ns/core) (ns/extra) (ns/development) (ns/style) (ns/blog-generate))"
if ! elisp_timeout=120 elisp "(ns/blog-generate)"; then
    echo "generation failure"
    exit 1
fi

rm -rf /tmp/notes.neeasade.net
cp -r site /tmp/notes.neeasade.net

git reset --hard

git checkout master

git fetch origin
git reset --hard origin/master

# rm -rf *
cp -r /tmp/notes.neeasade.net/* ./

git add --all
git commit -m "auto commit publish.sh"
git push origin master
git checkout source

if ! $clean_tree; then
    git stash pop
fi
