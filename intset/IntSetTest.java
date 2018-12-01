package intset;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;


//import framework.Assert.assertTrue;
//import framework.Assert.assertFalse;
//import framework.Assert.assertEquals;

import abstractions.IntSet;

public class IntSetTest
{
	public static void main(String[] args)
	{
		runTest1();
	}
	
	
	//Tests adding a single element to the set
	static void runTest1()
	{
		IntSet iSet = new IntSet();
		
		//Make sure the intSet was initialized empty
		assertTrue(iSet.size() == 0); 
		
		int valToStore = 5;	
		iSet.insert(valToStore);
		
		assertTrue(iSet.size() == 1);
		
		System.out.println("Test complete.");
	}
}
