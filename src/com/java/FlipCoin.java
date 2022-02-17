package com.java;

import java.util.Random;
import java.util.Scanner;

  public class FlipCoin{
	public static void FlipCoin() {
		System.out.println("Enter no of times to flip coin");
		Scanner scanner = new Scanner(System.in);
		int num = scanner .nextInt();
		int numberofTimes = 0;
		double headCount = 0;
		double tailCount = 0;
		int CoinStatus =0 ;
		 if(num > 0) {
			 while (numberofTimes < num) {
				 Random random = new Random();
				 CoinStatus = random.nextInt(2);
				 
			if (CoinStatus == 0) {
				 ++tailCount ;
			}
			else 
				{
					++headCount;
				}
			numberofTimes++;
	}
}
			    double headCountPercentage = (double) ((headCount / num) * 100);
				System.out.println("headCountPercentage= " + headCountPercentage);
				double tailCountPercentage = (double) ((tailCount / num) * 100);
				System.out.println("tailCountPercentage= " + tailCountPercentage);
				scanner.close();
	}
		 public static void main(String[] args) {
				FlipCoin(); 
 }}
