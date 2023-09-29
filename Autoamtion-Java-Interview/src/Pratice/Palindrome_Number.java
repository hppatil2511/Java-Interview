package Pratice;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =363;
		int rev=0;
		int rem;
		int s;
		s=n;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
				
		}
		if(rev==s)
		{
			System.out.println(rev+" Number is Pallindrome Number");
		}
		else
		{
			System.out.println(rev+ "Number is not Pallindrome Number");	
		}
		
	}

}
