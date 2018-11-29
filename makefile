.PHONY: execute
.PHONY: clean

all: Q1/Q1.prog

Q1/Q1.prog: Q1/damatozw_maxp.c
	gcc -o Q1/Q1.prog Q1/damatozw_maxp.c -g

clean:
	rm */*.gch */*.out */*.prog */*.o -rf

execute: all
	Q1/Q1.prog
