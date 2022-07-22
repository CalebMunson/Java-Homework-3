package assignment3;

//Create a stringbuilder and practice its methods

//This file contains a StringBuilder and performs various commands to it

public class Prompt3 {
	public static void main(String[] args) {
		StringBuilder build = new StringBuilder("This is a StringBuilder!");
		
		System.out.println(build);
		
		System.out.println("length is " + build.length());
		System.out.println("capacity is " + build.capacity());
		
		build.append(" It is different from a StringBuffer only in that it is non-synchronized!");
		System.out.println(build);
		
		System.out.println("length is " + build.length());
		System.out.println("capacity is " + build.capacity());
		
		build.insert(69, "hihihihihihihi");
		System.out.println(build);
		
		build.reverse();
		System.out.println(build);
		
		build.delete(0, 14);
		System.out.println(build);
		
		build.reverse();
		System.out.println(build);
	}
}
