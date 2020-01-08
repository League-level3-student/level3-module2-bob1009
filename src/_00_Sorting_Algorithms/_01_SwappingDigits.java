package _00_Sorting_Algorithms;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);

	}

	@Test
	void test2() {
		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);
	}

	@Test
	void test3() {
		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {
			System.out.println(arr[0]+"/"+arr[1]);
			int space=0;
		space=arr[0];
		arr[0] = arr[1];
		arr[1]=space;
		
	System.out.println(arr[0]+"//"+arr[1]);
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		int space=0;
		while (_00_SortedArrayChecker.intArraySorted(arr)==false) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]+"/"+arr[i+1]);
			if (arr[i] > arr[i + 1]) {
				space=arr[i];
				arr[i] = arr[i+1];
				arr[i+1]=space;
				System.out.println(arr[i]+"//"+arr[i+1]);
			}
		}
	}}

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		int hold=0;
		int middle = arr[0];
		hold=arr.length/2;
		middle=arr[hold];
		return middle;
	}
}