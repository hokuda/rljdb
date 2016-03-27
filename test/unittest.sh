#!/bin/sh

export CLASSPATH=.
javac -g Test.java

rlwrap -C jdb -b ' .' -z ./unittest_filter jdb Test
