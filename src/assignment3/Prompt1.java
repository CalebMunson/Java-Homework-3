package assignment3;

//Create a string and practice string methods

//This file contains testString and some other strings, and various methods are performed on them.
//It is important to note that you can't modify the strings directly, but instead need to replace them with a new string each time they are 'modified'

public class Prompt1 {
	public static void main(String[] args) {
		String testString = "This is an example string.";
		
		//Prints the initial string
		System.out.println(testString);
		
		//Prints the string length
		System.out.println("String length: " + testString.length());
		
		//Prints the character at given index
		System.out.println("The character at index 3 is " + testString.charAt(3));
		
		//concatenates to the string
		testString = testString.concat(" This part was concatenated to the string!");
		System.out.println(testString);
		
		//converts to a char array and prints
		char[] testArray = testString.toCharArray();
		System.out.println(testArray);
		
		//Prints the last index of 'string'
		System.out.println("First index of 'string': " + testString.indexOf("string"));
		System.out.println("Last index of 'string' starting at position 75: " + testString.lastIndexOf("string", 75));
		
		//shows that indexOf is case sensitive (it only finds the second instance since the first is 'String'
		System.out.println("First index of 'String' starting at position 25: " + testString.indexOf("String", 25));
		System.out.println("Last index of 'String': " + testString.lastIndexOf("String"));
		
		//trims the string. this doesnt really do anything since the string doesnt have whitespace on either end
		testString = testString.trim();
		System.out.println(testString);
		
		//converts to upper case
		testString = testString.toUpperCase();
		System.out.println(testString);
		
		//converts to lower case
		testString = testString.toLowerCase();
		System.out.println(testString);
		
		//checks if the string ends with a "!"
		System.out.println(testString.endsWith("!"));
		
		//creates a substring of the first sentence
		testString = testString.substring(0, 26);
		System.out.println(testString);
		
		//checks if it ends with a "!" again
		System.out.println(testString.endsWith("!"));
		testString = testString.concat(" This part was concatenated to the string!");
		
		//removes the first sentence of the string
		testString = testString.substring(27);
		System.out.println(testString);
		
		//replaces t with T
		testString = testString.replace("t", "T");
		System.out.println(testString);
		
		//shows that indexOf is case sensitive
		System.out.println(testString.indexOf("string"));
		
		//shows that it could find 
		testString = testString.toLowerCase();
		System.out.println(testString.indexOf("string"));
		
		//converts the value to a string
		double d = 3.05;
		System.out.println(testString.valueOf(d));
		
		//splits the string into an array of strings
		testString = "This is an example string. This part was not concatenated to the string!";
		String[] splitString = testString.split(" ");
		for(String temp : splitString)
			System.out.println(temp);
		
		//compares the 2 strings both case sensitve and not
		String capsStr = "HELLO";
		String lowStr = "hello";
		System.out.println("case sensitive: " + capsStr.equals(lowStr));
		System.out.println("case insensitive: " + capsStr.equalsIgnoreCase(lowStr));
	}
}

