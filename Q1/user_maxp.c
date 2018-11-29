#include<stdio.h>

/* @ requires \ valid ( p ) && \ valid ( q ) ;
ensures * p <= * q ;
ensures (* p == \ old (* p ) && * q == \ old (* q ) ||
* q == \ old (* p ) && * p == \ old (* q ) );
*/
void maxptr(int * p, int * q)
{
	if(*p <= *q) return;
	
	int * swap = p;
	p = q;
	q = swap;
}

int a = 10;
int b = 5;

void print()
{
	printf("%i, %i\n", a, b);
}

int main()
{
	print();

	maxptr(&b, &a);

	print();

	maxptr(&a, &b);

	print();

	return 0;
}
