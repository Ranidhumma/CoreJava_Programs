package com.java;

import java.util.Scanner;

public class Leapyear {

	public static void Leapyear(){
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the year in 4 digit number");
		 int year = scanner.nextInt();
	
		 if ((year % 4 == 0) && ((year % 100) != 0) || (year % 400 == 0))

             {
			 System.out.println("leap year");
			 }
	       
	 else {
		 System.out.println("not a leap year");
		 }
	scanner.close();
	}
	public static void main(String[] args) {
        Leapyear();
	}

}
