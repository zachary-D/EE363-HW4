class Rational {

    //Rationals are mutable
	
    // AbsFunc: n/d
    // Invariant: d > 0
	
    private int n, d;
	
    public Rational() {
	this(0, 1);
    }
	
    public Rational(int r) {
	this(r, 1);
    }

    public Rational(int num, int denom) {
        if (denom == 0)
            throw new RuntimeException("simplerational: denominator cannot be zero.");

        if (denom < 0) {
            d = -1 * denom;
            n = -1 * num;
        } else {
            n = num;
            d = denom;
        }
        checkInvariant();
    }
	
    public boolean checkInvariant() {
	if (d < 0) 
	    throw new IllegalArgumentException("denominator should be more than 0");
		
	return true;
    }

    public int getA() {
	return n;
    }
	
    public int getB() {
	return d;
    }
	
    public double getQuotient() {
	return  n*1.0/d;
    }
	
    // private static int gcd(int x, int y) {
    // 	return y == 0 ? x : gcd(y, x % y);
    // }
	
    //@ assignable n, d;
    //@ ensures (* this rational is in its reduced form*);
    //@ ensures BasicNum.gcd(n, d) == 1;
    private void reduce()  {
	try {
	    if (n != 0) {
		int n_d_gcd = BasicNum.gcd(n, d);
		
		n = n/n_d_gcd;
		d = d/n_d_gcd;
	    }
	} catch (ZeroException e) {
	    System.err.println("Rational.reduce: caught ZeroException from BasicNum.gcd; this should never happen!");
	}
	checkInvariant();
    }

    
	
    public Rational recip() {
	return new Rational(d, n);
    }

    //@ assignable this, r2;
    public void add(Rational r2) {
	reduce();
        r2.reduce();
	int td = d*r2.d;
        int tn = n*r2.d + r2.n*d;
        n = tn;
        d = td;
	checkInvariant();
    }

    //@ Override
    public boolean equals(Object obj) {
	if (obj instanceof Rational) {
	    Rational tmp = (Rational) obj;
	    return this.isEqual(tmp);
	}

	return false;
    }

    //@ assignable this, r2;
    public boolean isEqual(Rational r2) {
	this.reduce();
        r2.reduce();
	return (r2.n == this.n && r2.d == this.d);
        ///return (this.n == 0) ? (this.n == r2.n) : (r2.n == this.n && r2.d == this.d);
    }
	
    @Override
    public String toString() {
	return n + "/" + d;
    }
	
	
	
}
