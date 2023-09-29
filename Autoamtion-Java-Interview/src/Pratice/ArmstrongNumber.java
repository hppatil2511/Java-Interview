package Pratice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=153,originalNumber,reminder,result=0;
		
		originalNumber=number;
		while(originalNumber>0)
		{
			reminder=originalNumber%10;
			result +=Math.pow(reminder, 3);
			originalNumber /=10;
			
			
		}
		if(result==number)
		{
			System.out.println("Number is armstrong number "+number);
		}
		else
		{
			System.out.println("Number is not armstrong number "+number);
		}
		
		

	}

}

/*
 * First, given number (number)'s value is stored in another integer variable,
 * originalNumber. 
 * This is because, we need to compare the values of final
 * number and original number at the end. 
 * Then, a while loop is used to loop
 * through originalNumber until it is equal to 0. On each iteration, the last
 * digit of num is stored in remainder. Then, remainder is powered by 3 (number
 * of digits) using Math.pow() function and added to result. Then, the last
 * digit is removed from originalNumber after division by 10. Finally, result
 * and number are compared. If equal, it is an Armstrong number. If not, it
 * isn't.
 * 
 * 
 * 
 */
