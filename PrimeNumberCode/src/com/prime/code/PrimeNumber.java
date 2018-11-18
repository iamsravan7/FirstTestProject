package com.prime.code;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int j=2; j<=input; j++)
		{
			int count =0;
			for (int i=2;i<j;i++)
			{
				if ((j%i) == 0)
				{	
					count++;
					break;
				}
			}
				if (count==0)
				{
					System.out.println(j);
				
				}
		
		}
		}

}
