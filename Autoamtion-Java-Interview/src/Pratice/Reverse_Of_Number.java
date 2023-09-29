package Pratice;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=234;
		int rev=0;
		int rem;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev =rev*10+rem;
			
		}
		System.out.println("Number is reversed  "+rev);
		
	}

}
