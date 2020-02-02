package Test;

public class DemoConstructor
{
	String s1;

	public DemoConstructor()
	{
		System.out.println("This is default constructor");
	}
	
	public DemoConstructor(String s)
	{
		s1=s;
		System.out.println("This is parameterised contructor");
	}
}
