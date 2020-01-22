package Exercise;

import java.util.Scanner;

// Program to display reverse of a given number
public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		
		int number=sc.nextInt();
		
		int reverse=0;
		int rm;
		
		while(number>0)
		{
			rm=number%10;
			reverse=reverse*10+rm;
			number=number/10;	
		}
		System.out.println("Reverse of number"+"="+reverse);
	}

}
