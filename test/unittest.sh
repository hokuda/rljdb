#!/bin/sh

export CLASSPATH=.
$JAVA_HOME/bin/javac -g -d . TestEscapeDotA.java
$JAVA_HOME/bin/javac -g -d . TestEscapeDotB.java
$JAVA_HOME/bin/javac -g Test.java

JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=y"

java $JAVA_OPTS Test &
rlwrap -C jdb -b ' .' -z ./unittest_filter $JAVA_HOME/bin/jdb -attach localhost:8787

#rlwrap -C jdb -b ' .' -z ./unittest_filter $JAVA_HOME/bin/jdb -classpath . Test
