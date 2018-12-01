#!/usr/bin/env bash

rm -f *class
javac -cp /usr/share/java/junit4.jar *java
java -cp  .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore RationalTest


# # Polaris
# rm -f *class
# javac -cp /usr/share/java/junit.jar *java
# java -cp  .:/usr/share/java/junit.jar org.junit.runner.JUnitCore RationalTest

