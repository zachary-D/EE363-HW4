package intset;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class IntSetTest
{
	
	//Tests adding a single element to the set
	@Test
	public void test1()
	{
		IntSet iSet = new IntSet();
		
		//Make sure the intSet was initialized empty
		assertTrue(iSet.size() == 0); 
		
		int valToStore = 5;	
		iSet.insert(valToStore);
		
		assertTrue(iSet.size() == 1);
		
		System.out.println("Test complete.");
	}
	
	@Test
	public void test2()
	{
		
	}
}