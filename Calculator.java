import java.io.*;
import java.util.*;
public class Calculator
{
	public static void main(String[] args) 
	{
		int a=2500;
		int b=25;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the operators (+,-,*,/)::");
		String optr=args[0];

		System.out.println("..............Calculator................");
		if(optr.equals("+"))
		{
		System.out.println("Sum: "+(a+b));
		}
		else if(optr.equals("-"))
		{
		System.out.println("Difference: "+(a-b));
		}
		else if(optr.equals("*"))
		{
		System.out.println("Product: "+(a*b));
		}
		else if(optr.equals("/"))
		{
		System.out.println("Quotient: "+(a/b));
		}
		else
		{
		System.out.println("Invalid operator......");
		}
	}
}
