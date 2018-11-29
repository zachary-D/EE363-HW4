#include<stdio.h>

/* @ requires \ valid ( p ) && \ valid ( q ) ;
ensures * p <= * q ;
ensures (* p == \ old (* p ) && * q == \ old (* q ) ||
* q == \ old (* p ) && * p == \ old (* q ) );
*/
void maxptr(int * p, int * q)
{
	if(*p <= *q) return;
	
	int pAct = *p;
	int qAct = *q;
	
	*q = pAct;
	*p = qAct;
}

int a = 10;
int b = 5;

int *a_addr = &a;
int *b_addr = &b;

void print()
{
	printf("%i, %i\n", a, b);
	if(&a != a_addr || &b != b_addr) printf("Pntr mismatch!");
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
