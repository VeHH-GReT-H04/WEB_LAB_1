#!/bin/bash

javac -cp lib/commons-codec-1.8.jar:lib/org.apache.commons.io.jar *.java

jar cvfm myHashFunk.jar Manifest.md *.class
