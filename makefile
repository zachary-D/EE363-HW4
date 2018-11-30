.PHONY: execute
.PHONY: clean

all: Q1.prog IntSetTest.class

Q1.prog: damatozw_maxp.c
	gcc -o Q1.prog damatozw_maxp.c -g

IntSetTest.class: IntSetTest.java
	javac IntSetTest.java
	
clean:
	rm *.gch *.out *.prog *.o -rf

execute: all
	./Q1.prog
	java -cp dhouIntSet.jar IntSetTest.main
