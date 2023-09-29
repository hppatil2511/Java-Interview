package Pratice;

import java.util.Scanner;


public class PrimeNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int start =s.nextInt();
		System.out.println("Enter Second Number  :");
		int end =s.nextInt();
		
		System.out.print("List of prime numbers between "+start+" and "+end);
		
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
			
		}
		
		

	}

	private static boolean isPrime(int n) {
		
		// TODO Auto-generated method stub
		if(n<=1) {return false;}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) {return false;}
			
		}
		
		return true;
	}

}
