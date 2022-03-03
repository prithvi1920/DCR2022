package package3;

public class Class4 extends Class3
{
	

		public void child()
		{
			super.parent1(1);
			System.out.println("child default");
		}
		public void child1(int a)
		{
			this.child3(1,2,3);
			System.out.println("child one param ");
		}
		public void child2(int a,int b)
		{
			this.child1(1);
			System.out.println("child 2 para");
		}
		public void child3(int a,int b,int c)
		{
			this.child();
			System.out.println("child 3 para");
		}
		
		public static void main(String[] args) {
			
			Class4 obj=new Class4();
			obj.child2(1,2);
		}
	}


