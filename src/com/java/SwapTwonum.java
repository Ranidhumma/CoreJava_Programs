package com.java;

import java.util.Scanner;

public class SwapTwonum {
	
   public static void Swap() {
	
	   int t ;
	   System.out.println("Enter x and y");
	   Scanner scanner = new Scanner(System.in);
	   
	   int x = scanner.nextInt();
	   int y = scanner.nextInt();
	   System.out.println("Before swapping: "+x +"  " + y);
	  t = x;
	  x = y;
	  y = t;
	  
	   scanner.close();
	   System.out.println("After swapping: "+x +"   " + y);
}
	public static void main(String[] args) {
		Swap();

	}

}
