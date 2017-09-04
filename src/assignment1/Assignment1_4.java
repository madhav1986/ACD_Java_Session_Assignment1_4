package assignment1;
import java.util.Scanner;
// This class will be used for Typecasting of variables
public class Assignment1_4 
{

	public static void main(String[] args)  // Main methods starts
	{
		byte b; // Declare byte variable
		short s; // Declare short variable
		int i;  // Declare int variable 
		long l; // Declare long variable
		float f; // Declare float variable
		double d; // Declare double variable
		
		/*
		 Accept Different type of input variables from user and print the sum
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter byte variable");
		b=input.nextByte();
		System.out.println("Please enter short variable");
		s=input.nextShort();
		
		i=b+s;	
		System.out.println("Sum of Byte and short variables is : "+i);
		
		System.out.println("Please enter short variable");
		s=input.nextShort();
		System.out.println("Please enter int variable");
		i=input.nextInt();
		
		l=s+i;
		System.out.println("Sum of short and int variables is : "+l);
		
		System.out.println("Please enter int variable");
		i=input.nextInt();
		System.out.println("Please enter long variable");
		l=input.nextLong();
		
		f=i+l;
		System.out.println("Sum of int and long variables is : "+f);
		
		System.out.println("Please enter long variable");
		l=input.nextLong();
		System.out.println("Please enter float variable");
		f=input.nextFloat();
		
		d=l+f;
		System.out.println("Sum of long and float variables is : "+d);
		
		input.close();
	}

} // class closed
