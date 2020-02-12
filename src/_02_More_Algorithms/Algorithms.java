package _02_More_Algorithms;

import java.util.List;

import org.junit.experimental.theories.FromDataPoints;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
	
			for (int i = 0; i < eggs.size(); i++) {
				if (eggs.get(i).equals("cracked")) {
					
					return i;
				}
			
		
		
	}
			return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count=0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)==true) {
				
				count+=1;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double count=0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)>count) {
				count=peeps.get(i);
			}
		}
		return count;
	}

	public static String findLongestWord(List<String> words) {
		String Word = null;
		int word=words.get(0).length();
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>word) {
				word=words.get(i).length();
				Word=words.get(i);
			}
		}
		return Word;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		double space=0;
		for (int j = 0; j < results.size(); j++) {
		for (int i = j+1; i < results.size(); i++) {
			if (results.get(j)>results.get(i)) {
				space=results.get(j);
				results.set(j, results.get(i));
				results.set(i, space);
			}
		}}
		
		return null;
}
	public static List <Integer> Dna(List<String> unsortedSequences){
		String space=null; 
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(i).length()>unsortedSequences.get(i+1).length()) {
					space=unsortedSequences.get(i);
					unsortedSequences.set(i,unsortedSequences.get(j));
					unsortedSequences.set(j, space);
				}
			}
		}
		
		return null;
	}
	public static List <String>sortword(List <String> words){
		
	}
}


