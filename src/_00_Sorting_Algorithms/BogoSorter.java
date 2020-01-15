package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
			}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	// It works by following these steps
	
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random rand=new Random();
while ( _00_SortedArrayChecker.intArraySorted(array)==false) {
for (int i = 0; i < array.length; i++) {
	if (array[i]>i+1) {
int ran=rand.nextInt(array.length);	
	int ran2=rand.nextInt(array.length);
	int space=0;
	space=array[ran];
	array[ran] =array[ran2];
	array[ran2]=space;
	display.updateDisplay();
	}
}
	}
}

	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.

	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
			
		}
