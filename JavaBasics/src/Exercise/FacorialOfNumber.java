package Exercise;

import java.util.Scanner;

//Program to display factorial of a given number

public class FacorialOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter any number ");
		
		int number=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of a number is : "+fact);
	}
	
	

}
