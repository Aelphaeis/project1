package com.dixon.project;

public class Q2 {

	//This is completely right; however, could have been shorted
	public static void main(String[] args) {
		System.out.println(displayScreen(4));
	}
	//notice my in lining.
	public static int displayScreen(int value) {
		return value * value;
	}
}
