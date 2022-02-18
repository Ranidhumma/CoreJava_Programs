package com.java;

import java.util.Scanner;

public class Harmonic {

	public static void harmonicNumber() {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Harmonic value");
		int N = scanner.nextInt();
		if (N != 0) {
			for (i = 1; i < N; i++) {
				System.out.print("1/" + i + " + ");
			}
			//System.out.print("1/" + i + "");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		harmonicNumber();

	}

}	
	
	
	
	
	
	
	
	
	