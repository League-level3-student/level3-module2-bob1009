package _02_More_Algorithms;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Checkpoint {
	
	double space = 0;

	public static void main(String[] args) {
		double[] array = { 7, 3, 7, 9, 2, 3, 1, 0 };
		int [] intarray= {1,2,3,4,5,6};
		int singleint=3;
	Checkpoint chuck=new Checkpoint();	
	chuck.sort(array);
	 chuck.checkcontained(intarray, singleint);
	}

	public void sort(double[] dub) {
		while (checksorted(dub) == false) {

			for (int i = dub.length-1; i > dub.length - 1; i--) {
				if (dub[i] > dub[i - 1]) {
					space = dub[i];
					dub[i] = dub[i - 1];
					dub[i - 1] = space;

				}
			}

		}
		System.out.println(dub);
	}

	private static boolean checksorted(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}

		}
		return true;

	}
	public boolean checkcontained (int[]unt, int unit) {
		for (int i = 0; i < unt.length; i++) {
		if (unt[i]==unit) {
		return true;
		}
	}
		return false;
		}
}
