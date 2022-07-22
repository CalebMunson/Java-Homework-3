package assignment3;

//Create an integer array with 10 values: find the sum of evens and the sum of odds in the array

//This file contains an array of ints, and is called with 10 values. A for each loop then sums up the values

public class Prompt4 {
	public static void main(String[] args) {
		int[] nums = {83, 64, 46, 90, 55, 33, 22, 10, 36, 77};
		int evens = 0;
		int odds = 0;
		for (int vals : nums) {
			if (vals % 2 == 0) {
				evens += vals;
			}
			else odds += vals;
		}
		
		System.out.println("The sum of odd numbers from the array is: " + odds);
		System.out.println("The sum of even numbers from the array is: " + evens);
	}
}
