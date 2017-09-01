package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {
	

	public static void main(String[] args) {
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount billed: ");
		
		double amountBilled = input.nextDouble();
		
		System.out.print("Enter the amount tendered: ");
		
		double amountTendered = input.nextDouble();
		
		System.out.print(twoDecimals.format(changeRequired(amountBilled,amountTendered)));
		
		
	}
	
	public static double changeRequired (double amountBilled, double amountTendered) {
		
		double changeReturned = (amountTendered - amountBilled);
		return (changeReturned);
		
	}
}
