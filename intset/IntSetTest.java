package intset;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class IntSetTest
{
	
	/*
		Tests the default constructor, to make sure it creates an empty IntSet
	*/
	@Test
	public void test1()
	{
		IntSet iSet = new IntSet();
		
		//Make sure the intSet was initialized empty
		assertTrue(iSet.size() == 0); 
	}
	
	/*
		Tests the array constructor, to make sure it creates an IntSet containing the array
	*/
	@Test
	public void test2()
	{
		int arr[] = {1, 2, 5};
		
		IntSet iSet = new IntSet(arr);
		
		for(int i = 0; i < 3; i++)
		{
			assertTrue(iSet.getAll() == arr);
		}
	}
}