package package3;

public class Class1 
{
	public Class1()
	{
		this(1,2,3);
		System.out.println("parent default");
	}
	
	public Class1(int a)
	{
		this(1,2);
		System.out.println("parent 1 param");
	}
	
	public Class1(int a , int b)
	{
		this();
		System.out.println("parent 2 param");
	}
	
	public Class1(int a , int b,int c)
	{
		
		System.out.println("parent 3 param");
	}
}
