package com.java;

import java.util.Scanner;

public class Evenodd {
    public static void evenOddCheck(){
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num = scanner.nextInt();
	 if (num % 2 == 0) {
		 System.out.println("even");
	 }
	 else {
		 System.out.println("odd");
		 
	 }
	 scanner.close();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddCheck();

	}

}
