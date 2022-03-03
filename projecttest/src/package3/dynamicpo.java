package package3;

public class dynamicpo extends Dynamicp
{
	public void arithmetic(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
	
	dynamicpo obj=new dynamicpo();
	obj.arithmetic(12,2);
	}
	
}
