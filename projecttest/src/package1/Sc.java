package package1;

import java.util.Scanner;

public class Sc 

{
	public int sum(int x1, int x2)
	{
	int y1;
	y1=x1+x2;
	return y1;
		
	}
	
	public int sub(int x3, int x4)
	{
		int y2;
		y2=x3-x4;
		return y2;
	}
	
	public int mul(int x5,int x6)
	{
		int y3;
		y3=x5*x6;
		return y3;
	
	}
	public int div(int x7,int x8)
	{
		int y4;
		y4=x7/x8;
		return y4;
	}
	
	public static void main(String[] args) 
	
	{
		
		Scanner s=new Scanner(System.in);
		Sc obj=new Sc();
		
		System.out.println("enter x1");
		int x1=s.nextInt();
		System.out.println("enter x2");
		int x2=s.nextInt();
		int sum1=obj.sum(x1,x2);
		
		System.out.println("enter x3");
		int x3=s.nextInt();
		int sub=obj.sub(sum1,x3);
		
		System.out.println("enter x4");
		int x4=s.nextInt();
		int sum2=obj.sum(sub,x4);
		
		System.out.println("enter x5");
		int x5=s.nextInt();
		int mul=obj.mul(sum2,x5);
		
		System.out.println("enter x6");
		int x6=s.nextInt();
		int div=obj.div(mul,x6);
		
		System.out.println("final is"+div);
	}

}