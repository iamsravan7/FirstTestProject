package com.prime.code;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count =0;
		for (int i=2;i<input;i++)
		{
			if ((input%i) == 0)
			{	
				count++;
				break;
			}
		}
			if (count==0)
			{
				System.out.println("input is prime number");
			
			}
			else
			{
				System.out.println("input is not prime number");
			}
	}

}
