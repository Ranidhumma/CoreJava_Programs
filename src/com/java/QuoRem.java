package com.java;

import java.util.Scanner;

public class QuoRem {
    public static void QuotientRemainder() {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number divedent");
	
	int divedent = scanner.nextInt();
	System.out.println("Enter a number to divide");
	int divider = scanner.nextInt();
	
	int quotient = divedent / divider;
	int remainder = divedent % divider;
	System.out.println("quotient= " + quotient +  "\nremainder = " + remainder);  //\n use for next line
	scanner.close();
	
}

	public static void main(String[] args) {
		QuotientRemainder ();
	}

}
