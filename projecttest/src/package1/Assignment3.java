package package1;

public class Assignment3 
{
	public Assignment3() 
	{
		this(1,2,3);
		System.out.println("Default constructor");
	}
	public Assignment3(int a)
	{
		this(1,2,3,4);
		System.out.println("1 parameter");
	}
	public Assignment3(int a, int b)
	{
		this();
		System.out.println("2 parameter");
	}
	public Assignment3(int a, int b, int c)
	{
		System.out.println("3 parameter");
	}
	public Assignment3(int a, int b, int c , int d)
	{
		this(1,2);
		System.out.println("4 parameter");
	}
	public static void main(String[] args) 
	{
		
		Assignment3 refva=new Assignment3(1);
//		Assignment3 refva1=new Assignment3(1,2);
//		Assignment3 refva2=new Assignment3(1,2,3);
//		Assignment3 refva3=new Assignment3(1,2,3,4);
//		Assignment3 refva4=new Assignment3();
		
		
	}
}
