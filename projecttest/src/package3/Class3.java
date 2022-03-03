package package3;

public class Class3 
{

	public void parent()
	{
		this.parent3(1,2,3);
		System.out.println("parent default");
	}
	public void parent1(int a)
	{
		this.parent2(1,2);
		System.out.println("parent one param ");
	}
	public void parent2(int a,int b)
	{
		this.parent();
		System.out.println("parent 2 para");
	}
	public void parent3(int a,int b,int c)
	{
		System.out.println("parent 3 para");
	}
}
