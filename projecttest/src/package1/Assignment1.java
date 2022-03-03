package package1;

public class Assignment1 

{
int age;//
int rollno;

public void display1()

{
	System.out.println("display1");
}

public void display2()
{
	System.out.println("display2");
}

public static void main (String[] args)
{
	Assignment1 refva=new Assignment1();
	refva.age=30;
	refva.rollno=26;
	System.out.println(refva.age);
	System.out.println(refva.rollno);
	
	refva.display1();
	refva.display2();
	
}
}
//update//
