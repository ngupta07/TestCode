package com.HomeAssignment_Question1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString.reverse();
	}

	public static void reverse() {
		String original;
		String reverse = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		original = scan.nextLine();

		int length = original.length();
		for (int i = length - 1; i >= 0; i--)

			reverse = reverse + original.charAt(i);
		System.out.println(reverse);

	}
}
