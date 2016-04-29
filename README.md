rljdb
=====

rljdb is a wrapper script to enhance jdb. It supports:

* Command history
* Command completion
* Local variable name completion
* Class name comletion
* Field/method name completion
* Command name abbreviation
* Reading break points in file at startup
* Reading sourcepath in file at startup
* Repeating the last command with enter key
* Enhanced clear command

## Prerequisites

* rljdb uses rlwrap
* rlrwapfilter.py
* rljdb is written in python

## Installation

* copy rljdb and rljdb_filter to your bin directory

## How to use

        # rljdb [jdb options]

rljdb passes all options to jdb.

## Features

### command history

If the `rljdb.history` file exists in the current directory, rljdb reads it at startup. The command history is saved when rljdb exits. C-r and C-s are available to search history.

### completion

Hitting TAB key fills in the rest of an item.

### command name abbreviation

    's', # step
    'c', # cont
    'p', # print
    'n', # next
    'w', # where
    'd', # dump
    'l', # list
    'b', # break(stop)

### reading break points in file at startup

If the `rljdb.breakpoint` file exists in the current directory, rljdb reads it and set break points at startup.

### reading sourcepath in file at startup

If the `rljdb.sourcepath` file exists in the current directory, rljdb reads it and set source paths at startup.
  
### repeating the last command with enter key

After executing step, cont, and next command, hitting ENTER key repeats the last command.

### enhanced clear command

`clear` command shows break points with indeces. `clear #` command clear the #th break point.

## Author

Hisanobu Okuda hisanobu.okuda@gmail.com
