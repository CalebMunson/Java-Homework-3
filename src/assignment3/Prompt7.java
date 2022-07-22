package assignment3;

//Write an example for pass by value and pass by reference

//swapVal is pass by value, and the values do not change.
//swapRef is pass by reference, and the values do change.

public class Prompt7 {
	public static void main(String[] args) {
		System.out.println("Difference between pass by value and pass by reference");
		
		swapVal swap1 = new swapVal(3, 4);
		swapRef swap2 = new swapRef(5, 6);
		
		System.out.println("x is: " + swap1.x + " and y is: " + swap1.y);
		swap1.swap(swap1.x, swap1.y);
		System.out.println("x is: " + swap1.x + " and y is: " + swap1.y);
		
		System.out.println("x is: " + swap2.x + " and y is: " + swap2.y);
		swap2.swap(swap2);
		System.out.println("x is: " + swap2.x + " and y is: " + swap2.y);
		
	}
}

class swapVal {
	int x, y;
	
	swapVal(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
}

class swapRef {
	int x, y;
	
	swapRef(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void swap(swapRef ref) {
		int temp;
		temp = ref.x;
		ref.x= ref.y;
		ref.y = temp;
	}
}
