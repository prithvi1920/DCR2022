package package3;

public class Class2 extends Class1
{
	public Class2()
	{
		super(1);
		System.out.println("child default");
	}
	
	public Class2(int a)
	{
		this(1,2,3);
		System.out.println("child 1 param");
	}
	
	public Class2(int a , int b)
	{
        	this(1);
		System.out.println("child 2 param");
	}
	public Class2(int a , int b,int c)
	{
        	this();
		System.out.println("child 3 param");
	}
	
	public static void main(String[] args) {
		
		Class2 obj=new Class2(1,2);
		
	}

}
