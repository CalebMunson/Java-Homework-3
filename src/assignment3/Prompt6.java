package assignment3;

//Create a 2D array and iterate and display all elements in matrix format

//This file contains a 2d array initialized with 3 rows of 4 ints. 
//2 for-each loops are used to print out the values from this array.

public class Prompt6 {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 0, 3},
						  {4, 0, 5, 6},
						  {0, 7, 8, 9}};
		for (int rows[] : matrix) {
			for (int nums : rows) {
				System.out.print(nums + " ");
			}
			System.out.println();
		}
	}
}
