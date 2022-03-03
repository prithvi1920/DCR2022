
package package1;

public class Assignments2 
{
	
public int sum (int a, int b)
{
	int c;
	c=a+b;
	System.out.println("sum 1 is "+c);
	return c;
	}


public int sub (int x,int y)
{
	int z;
	z=x-y;
	System.out.println("sub is"+z);
	return z;
}

public int multi(int a1,int b1)
{
	int c1;
	c1=a1*b1;
	System.out.println("multi is "+c1);
	return c1;
}

public void div(int x1,int y1)
{
	int z1;
	z1=x1/y1;
	System.out.println("div is "+z1);
	
}
public static void main(String[] args) {
	
	
	Assignments2 refva=new Assignments2();
	int sum1Result=refva.sum(10,2);
	int sum2Result=refva.sum(sum1Result,2);
	int subResult=refva.sub(sum2Result,2);
	int multiResult=refva.multi(subResult,2);
	refva.div(multiResult,2);
	

}
}












