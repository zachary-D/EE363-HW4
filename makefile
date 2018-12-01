.PHONY: execute
.PHONY: clean

all: Q1.prog intset/IntSetTest.class

Q1.prog: damatozw_maxp.c
	gcc -o Q1.prog damatozw_maxp.c -g

intset/IntSetTest.class: intset/IntSetTest.java
	javac intset/*.java -cp /usr/share/java/junit.jar
	
clean:
	rm *.gch *.out *.prog *.o *.class -rf

execute: all
	./Q1.prog
	java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore intset.IntSetTest
