package com.dixon.project;

public class Q1 {

	public static void old() {
		int start = 0; //good job with knowing that you need a counter
		int limit = 100; //good job with your limit
		while (start < limit){ //surprised with your usage of the while loop, a for loop was more appropriate	
			start = start + 1;
			System.out.println(start);
			
		}
	}
	/**
	 * Here is a re-write
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0 /*1) declare my index/counter*/; i < 100/*2)*/; i++ /*3)Increment i */) {
			//4)Output number
			System.out.println(i);
		}
		//This is how I expected you to do it.
		//The order in which this would run is
		// 1 > 2 > 4 > 3 > 2 > 4 > 3 > 2 (repeat 4 > 3 > 2 until 2) is false.)
		//This is much shorter and more elegant; however, what you did is technically right.
		//Be mindful to try to be elegant in your solutions.
	}
}
