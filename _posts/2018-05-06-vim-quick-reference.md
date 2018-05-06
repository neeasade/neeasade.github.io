---
layout: post
title: vim language quick reference
---

Example command `di(` (| is the cursor below):

``` txt
somefunc("here is a |string") --> somefunc()
```

The general form is `<action> <operator> <text object>`, or as I like to think, `<action> <verb> <noun>`. Verbs modify nouns.

So, for `di(` above:

- `d` is the action (delete)
- `i` is the verb (inside)
- `(` is the noun (matching parentheses)

Verbs are optional depending on the noun, but with this outline there are many commands you compose.

|action | mnemonic   | meaning                     |
|-------|------------|--------                     |
|d      | delete     | delete                      |
|y      | yank       | copy                        |
|c      | change     | delete and enter insert mode|
|v      | visual     | enter visual mode           |
|r      | replace    | replace                     |
|p      | paste      | paste                       |
|g      | go         | movement/jump to            |

|verb   | mnemonic   | meaning                                                |
|-------|------------|--------                                                |
|a      | around     | inclusive of noun selector                             |
|i      | inside     | exclusive of noun selector                             |
|t      | till       | forward to character, exclusive (character is the verb)|
|f      | find       | forward to character, inclusive                        |
|T      |            | backward to character, exclusive                       |
|F      |            | backward to character, inclusive                       |

|noun       | mnemonic    | meaning                             |
|-------    |------------ |--------                             |
|`(`,`[`,`{`,`}`,`]`,`}`|             | surrounding ([{ pairs               |
|%          |             | matching [{( under cursor, inclusive|
|w          | word        | word                                |
|s          | sentence    | sentence                            |
|p          | paragraph   | paragraph                           |
|`'`,`"`,`` ` ``      |             | surrounding "'` pairs               |
|t          | tag         | <tags> pairs of </tags>             |
|<,>        | tag         | <tags> pairs of </tags>             |
|/          |             | forward to search result            |
|?          | a           | backward to search result           |

You can install plugins to get more nouns and nice contextual actions. For example with tpope's [commentary][1] you get a `gc` action for commenting in whatever programming language you are in -- which you can compose with any of the above nouns and verbs!

[1]: https://github.com/tpope/vim-commentary