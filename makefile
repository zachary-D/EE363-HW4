all: Q1/Q1.prog

Q1/Q1.prog: Q1/damatozw_maxp.c
	gcc -o Q1/Q1.prog Q1/damatozw_maxp.c
