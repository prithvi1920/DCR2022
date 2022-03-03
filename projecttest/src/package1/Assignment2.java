package package1;

public class Assignment2 
{
public int sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("sum is"+ c);
	return c;
}
	
public int sub(int x, int y) 
{
	int z;
	z=x-y;
	System.out.println("sub is"+ z);
	return z;
}

public void multi(int a1, int a2)
{
	int a3;
	a3=a1*a2;
	System.out.println("final result"+ a3);
}
public static void main(String [] args)

{
	Assignment2 obj=new Assignment2();
	int sumResult=obj.sum(10, 2);
	int subResult=obj.sub(10, 2);
	obj.multi(sumResult,subResult);
}

}
