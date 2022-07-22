package assignment3;

//Create a string array and iterate it using a for-each loop

//This file contains a string array which is iterated in a for-each loop. The main benefit to this is seen in how clean the code is.
//Rather than a usual for loop where it would increment an index, a for-each loop simply goes through each value in an array.

public class Prompt5 {
	public static void main(String[] args) {
		String[] sentence = {"This", "is", "a", "sentence", "but", "in", "a", "string", "array."};
		for(String words : sentence) {
			System.out.print(words + " ");
		}
	}
}