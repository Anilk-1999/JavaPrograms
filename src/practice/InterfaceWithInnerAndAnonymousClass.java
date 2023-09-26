package practice;


abstract interface Showing_v1
{
    int a=10;
  	void show1();
  	void show2();
}
abstract class Showing_v2 implements Showing_v1
{
	public abstract void show3();
	//public abstract void show4();
	
  	public void show1()
  	{
  		System.out.println("show1");
  	}
  	public void show2()
  	{
  		System.out.println("show2");
  	}
  static abstract class Showing_v3 extends Showing_v2
  	{
	   public abstract void show4();
  	   public void show3()
  	   {
  		   System.out.println("show3");
  	   }
  	}
}
public class InterfaceWithInnerAndAnonymousClass
{
  public static void main(String[] args) {
	  Showing_v2.Showing_v3 s=new Showing_v2.Showing_v3()
			  {
		           public void show4()
		           {
		        	   System.out.println("show4");
		           }
			  };
	  s.show1();
	  s.show2();
	  s.show3();
	  s.show4();
	  System.out.println(Showing_v1.a);
}
}
