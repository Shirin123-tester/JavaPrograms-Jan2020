package Test;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) 
	{
	
		DemoConstructor dc=new DemoConstructor();  //This will invoke default constructor
		
		String str="This is parameterized constructor";
		
		DemoConstructor dc1=new DemoConstructor(str); //This will invoke parameterized constructor

	}

}
