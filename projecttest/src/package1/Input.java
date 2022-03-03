package package1;

import java.util.Scanner;

public class Input 
{

	public static void main(String[] args) 
	{
		System.out.println("enter a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("a is"+a);
		System.out.println("enter f");
		float f=s.nextFloat();
		System.out.println("f is "+f);

	}
}
