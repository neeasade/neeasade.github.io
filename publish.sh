#!/bin/sh
# generate and commit the site

cd "$(dirname $([ -L $0  ] && readlink -f $0 || echo $0))"
set -e

dirty_tree=$(iif 'git status | grep -q "working tree clean"')

vdo() {
    echo "$*"
    "$@"
}

if $dirty_tree; then
    vdo git stash
fi

export elisp_timeout=30
vdo elisp "(ns/blog-generate)"

vdo rm -rf /tmp/notes.neeasade.net
vdo cp -r site /tmp/notes.neeasade.net

vdo git checkout master
vdo rm -rf *
vdo cp -r /tmp/notes.neeasade.net/* ./

vdo git add --all
vdo git commit -m "auto commit publish.sh"
vdo git push origin master
vdo git checkout source

if $dirty_tree; then
    vdo git stash pop
fi
