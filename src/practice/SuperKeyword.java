package practice;



 class Name
{
	public void test()
	{
		System.out.println("anil");
	}
}
class Name1 extends Name
{ 
	private int b;
	int a;
	protected String name;
	public void test()
	{
		b=6;
		a = 5;
		name="ANIL";
		if(name=="Anil")
		{
			System.out.println("Anil");
		}
		else if(name=="ANIL")
		{
			for (int i = 0; i <a; i++) {
				System.out.println(name);
		}
	
		}else
		{
			System.out.println("Incorrect");
		}
		super.test();
		System.out.println("arun");
		
	}
}
class Test extends Name1
{
  public void test1()
  { 
	 
	  name="anil";
  }
}

public class SuperKeyword 
{
   public static void main(String[] args) {
	Name1 n =new Name1();
	n.test();
}
}
