package Pratice;

public class Reverse_Of_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Fiserv Hcl Technogoly Ness Digital";
		String Sp[]=s.split(" ");
		String reverse="";
		
		for(int i=Sp.length-1;i>=0;i--)
		{
			reverse=reverse+Sp[i]+" ";
		}
		
		System.out.println(reverse);
		

	}

}
//Digital Ness Technogoly Hcl Fiserv 