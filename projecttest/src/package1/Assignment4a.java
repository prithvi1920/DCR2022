package package1;

public class Assignment4a 
{
	public void defmethod()
	{
		this.method3();
		System.out.println("def method");
		
	}

	public void method1()
	{
		this.defmethod();
		System.out.println("method1");
		
	}
	public void method2()
	{
		this.method1();
		System.out.println("method2");
	}
	public void method3()
	{
		System.out.println("method3");
	}
	public void method4()
	{
		this.method2();
		System.out.println("method4");
	}
	public static void main(String[] args) 
	{
		Assignment4a refva=new Assignment4a();
		refva.method4();
		
		
	}
}
