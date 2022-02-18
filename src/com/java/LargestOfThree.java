package com.java;

import java.util.Scanner;

public class LargestOfThree {

	public static void Largestcheck() {
		int num1 = 0, num2 = 0, num3 = 0, num = 0;
		System.out.println("Enter three number");
		Scanner scanner = new Scanner(System.in);
		 num1 = scanner.nextInt();
	     num2 = scanner.nextInt();
		 num3 = scanner.nextInt();
		
		if (num1 > num2 && num1 > num3) {
		num = num1;
		}
		else if (num2 > num1 && num2 > num3) {
			num = num2;	
		}
	    else {
	    	num = num3;
	    }
	    //System.out.println(num + " is greater in " + num1 + "," + num2 + "," + num3); ...is largest number amoung 1,2,3
		System.out.println(num);
				
	scanner.close();
	}
	public static void main(String[] args) {
		Largestcheck ();
	}	
}

