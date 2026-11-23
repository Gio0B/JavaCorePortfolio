package it.giovanni.javacore;

public class ArrayAnalyzer {
	
	public static int findMax(int[] numbers) {
		
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Insert a valid array!");
		}
		
		int max = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(max <= numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] numbers) {
		
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Insert a valid array!");
		}
		
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++){
			if(min >= numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	public static double calculateAverage(int[] numbers) {
		
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Insert a valid array!");
		}
		
		double avg = 0;
		
		for (int i : numbers) {
			avg += i;
		}
		
		avg = avg / numbers.length;
		
		return avg;
		
	}
	
	public static int countOccurrences(int[] numbers, int target) {
		
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Insert a valid array!");
		}
		
		int rep = 0;
		
		for (int i : numbers) {
			if(i == target) {
				rep++;
			}
		}
		
		return rep;
		
	}
}
