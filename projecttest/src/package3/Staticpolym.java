package package3;

public class Staticpolym 
{

	public void addition(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	public void addition(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Staticpolym ob=new Staticpolym();
		ob.addition(1, 2);
		ob.addition(1, 2, 3);
	}
}
