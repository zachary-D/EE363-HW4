/* @ requires \ valid ( p ) && \ valid ( q ) ;
ensures * p <= * q ;
ensures (* p == \ old (* p ) && * q == \ old (* q ) ||
* q == \ old (* p ) && * p == \ old (* q ) );
*/
void maxptr(int * p, int * q);
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
	cout << a << ', ' << b << endl;
}

int main(int argc, char *[] argv)
{
	print();

	maxprt(&b, &a);

	print();

	maxprt(&a, &b);

	print();

	return 0;
}