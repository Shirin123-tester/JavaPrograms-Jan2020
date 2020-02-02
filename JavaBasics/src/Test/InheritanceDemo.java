//Program to implement Inheritance

package Test;

public class InheritanceDemo {

	public static void main(String[] args) 
	{
								
		Test2 obj=new Test2();    	//create object of sub class ie.Test2
		
		
		obj.displayTest1();     	//Using object of sub class can access methods of super class
		
		obj.displayTest2();			//class Test2 extends class Test1 hence can call Test1 method.

	
	}
}
