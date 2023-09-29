package Pratice;

public class Reverse_Of_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Fiserv Hcl Technogoly Ness Digital";
		
		String Sp[]= s.split(" ");
		String reverse="";
		String revnew="";
		
		for(int i=Sp.length-1;i>=0;i--)
		{
			reverse=Sp[i]+" ";
			
			for(int j=reverse.length()-1;j>=0;j--)
			{
				
				revnew= revnew+reverse.charAt(j);
			}
			
			
		}
		System.out.println(revnew);
		

	}

}
//latigiD sseN ylogonhceT lcH vresiF
