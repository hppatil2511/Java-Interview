package Pratice;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="madam";
		String reverse="";
		String n= null;
		n=s;
		
		for(int i =s.length()-1;i>=0;i--)
		{
			reverse =reverse+s.charAt(i);
			
		}
		
		if(reverse.equals(n))
		{
			System.out.println("String is pallindrome  :"+reverse);
		}
		else
		{
			System.out.println("String is not pallindrome  :"+reverse);
		}
		
	}

}
