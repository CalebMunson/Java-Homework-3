package assignment3;

//Create a stringbuffer and practice its methods

//This file contains a StringBuffer and performs various commands to it

public class Prompt2 {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("This is a StringBuffer.");
		
		System.out.println(buff);
		
		System.out.println("length is " + buff.length());
		System.out.println("capacity is " + buff.capacity());
		
		buff.append(" It is different because you can append to it!");
		System.out.println(buff);
		
		System.out.println("length is " + buff.length());
		System.out.println("capacity is " + buff.capacity());
		
		buff.insert(69, "hihihihihihihi");
		System.out.println(buff);
		
		buff.reverse();
		System.out.println(buff);
		
		buff.delete(0, 14);
		System.out.println(buff);
		
		buff.reverse();
		System.out.println(buff);
		
	}
	
}
