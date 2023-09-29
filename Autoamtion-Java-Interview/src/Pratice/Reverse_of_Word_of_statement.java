package Pratice;

public class Reverse_of_Word_of_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Fiserv Hcl Technogoly Ness Digital";
		String Sp[] =s.split(" ");
		String rev="";
		String revnew ="";
		
		for(int i=0;i<=Sp.length-1;i++)
		{
			rev=Sp[i]+" ";
			
			for(int j =rev.length()-1;j>=0;j--)
			{
				revnew =revnew+rev.charAt(j);
			}
			
		}
		System.out.println(revnew);

	}

}
// vresiF lcH ylogonhceT sseN latigiD