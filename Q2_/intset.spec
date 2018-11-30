// overview: IntSets are mutable, unbounded sets of integers.
//	    A typical IntSet is {x_1, x_2, ..., x_n}.


public class IntSet {


//[note: assignable is clause often omitted from constructor specs]
//@ ensures (* _this_ object is initialized as an empty intSet *);
public IntSet();


[//optional constructor]
//@ ensures (* _this_ object is initialized to the values in arr *);
public IntSet(int[] arr)

//@ assignable \everything;
//@ ensures (* adds x to the elements of _this_, i.e. _this_ = \old(this) U {x} *);
public void insert (int x);


//optional method
//@ assignable \nothing;
//@ ensures (* \result = array representing all values in _this_ *);
public int[] getAll();


//@ assignable \everything;
//@ ensures (* removes x from _this_ such that _this_ = \old(_this_) - {x} *);
public void remove (int x);


//@ ensures (* if x is in _this_, \result = true;  otherwise \result = false *);
//@ assignable \nothing;
public boolean isIn (int x);


//@ ensures (* \result = the number of elments in _this_ *);
//@ assignable \nothing;
public int size();


/*@ normal_behavior
  @ requires (* _this_ is nonempty *); 
  @ assignable \nothing;
  @ ensures (* \result = an arbitrary element of _this_ *);
  @ also
  @ exceptional_behavior
  @ requires  (* _this_ is empty *);
  @ assignable \nothing;
  @ signals (EmptyException e) true;
  @ signals_only EmptyException;
*/
public int choose();

}

