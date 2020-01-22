package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] x= {"meow", "woof", "quack", "moose noise"};
		String no="no";
		assertEquals(-1, _00_LinearSearch.linearSearch(x, no));
		assertEquals(0,_00_LinearSearch.linearSearch(x, "meow"));
		assertEquals(1,_00_LinearSearch.linearSearch(x, "woof"));
	}
	int[] X= {0, 1, 2, 3};
	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		
		
		assertEquals(0,_01_BinarySearch.binarySearch(X, 0, 3, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(X, 0, 3, 1));
		assertEquals(2, _01_BinarySearch.binarySearch(X, 0, 3, 2));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(X, 0));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(X, 1));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(X, 2));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(0,_03_ExponentialSearch.exponentialSearch(X,0));
		assertEquals(1,_03_ExponentialSearch.exponentialSearch(X,1));
		assertEquals(2,_03_ExponentialSearch.exponentialSearch(X,2));
		
	}
}
