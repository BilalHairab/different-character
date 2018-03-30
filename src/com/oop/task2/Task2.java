package com.oop.task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type two string variables with only one more letter in one of them:");
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		scanner.close();
		try {
			System.out.println("Different char is " + getDifferentChar(first, second));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	private static char getDifferentChar(String one, String two) throws Exception {
		char diff = 0;
		int largestLenght = 0;
		String largestString = "";
		if ((one.length() - two.length()) == 1) {
			largestLenght = one.length();
			largestString = one;
		} else if ((one.length() - two.length()) == -1) {
			largestLenght = two.length();
			largestString = two;
		} else
			throw new Exception("Strings should differ in ONE character only");
		for (int i = 0; i < largestLenght; i++) {
			if ((i == largestLenght - 1) || one.charAt(i) != two.charAt(i)) {
				diff = largestString.charAt(i);
				break;
			}
		}
		return diff;
	}
}
