#!/bin/bash
JRE=/usr/bin/java
JLIBDIR=./jlib
JUNIT_HOME=$JLIBDIR/junit-4.10.jar
CLASSPATH=$JUNIT_HOME:.
CLASS="TestRunner"
$JRE -cp $CLASSPATH $CLASS $@
