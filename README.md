rljdb
=====

`rljdb` is a wrapper script to enhance `jdb`. It gives `jdb`:

* [`delete` command to delete break point with index](#delete-command)
* [`break` command to declare conditional break point](#break-command)
* [command history](#command-history)
* [command completion](#completion)
* [local variable name completion](#completion)
* [class name comletion](#completion)
* [field/method name completion](#completion)
* [command name abbreviation](#command-name-abbreviation)
* [reading break points in file at startup](#reading-break-points-in-file-at-startup)
* [reading sourcepath in file at startup](#reading-sourcepath-in-file-at-startup)
* [repeating the last command with enter key](#repeating-the-last-command-with-enter-key)

## Prerequisites

* `rlwrap` (>=0.43)
* `python3`

## Installation

* copy `rljdb` and `rljdb_filter` to your bin directory

## How to use

        # rljdb [jdb options]

`rljdb` passes all options to `jdb`.

## Features

### `delete` command

`delete` command shows break points with indeces. `delete #` command deletes the #th break point.

### `break` command

`break` command shows break points with indeces.

`break <class>.<method>[(argument_type,...)]` command sets a break point in a method.

`break <class>:<line>` command sets a break point at a line. A break point at a line can have a condition by using `if` in the arguments to the `break` command like `break <class>:<line> if <condition>`. `<condition>` must be a boolean Java expression.

### command history

If the `rljdb.history` file exists in the current directory, `rljdb` reads it at startup. The command history is saved when `rljdb` exits. `C-r` and `C-s` are available to search history.

### completion

Hitting `TAB` key fills in the rest of an item.

### command name abbreviation

    s => step
    c => cont
    p => print
    n => next
    w => where
    d => dump
    l => list
    b => break

### reading break points in file at startup

If the `rljdb.breakpoint` file exists in the current directory, `rljdb` reads it and set break points at startup.

### reading sourcepath in file at startup

If the `rljdb.sourcepath` file exists in the current directory, `rljdb` reads it and set source paths at startup.
  
### repeating the last command with `enter` key

After executing `step`, `cont`, and `next` command, hitting `ENTER` key repeats the last command.

## Author

Hisanobu Okuda hisanobu.okuda@gmail.com
