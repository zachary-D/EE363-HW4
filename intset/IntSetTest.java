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
		
		int [] retarr = iSet.getAll();
		
		for(int i = 0; i < 3; i++)
		{
			//Makes sure the elements inserted are in the proper locations
			assertEquals(retarr[i], arr[i]);
		}
	}
	
	/*
		Tests IntSet.remove()
	*/
	@Test
	public void test3()
	{
		int arr[] = {1, 2, 3};
		
		IntSet iSet = new IntSet(arr);
		
		iset.remove(2);
		
		int [] retarr = iSet.getAll();
		
		int [] afterArr = {1, 3};
		
		for(int i = 0; i < 3; i++)
		{
			assertEquals(retarr[i], afterArr[i]);
		}
	}
}