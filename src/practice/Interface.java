package practice;


interface BikeImplementation
{
  	void wheel();
  	void mirror();
  	public default  void test()
  	{
  		System.out.println("test");
  	}
}
class BikeImplementation1 implements BikeImplementation
{
   public void wheel()
   {
	   System.out.println("hi");
   }
   public void mirror()
   {
	 System.out.println("hello");   
   }
}
public class Interface 
{
  public static void main(String[] args) {
	  BikeImplementation1 b=new BikeImplementation1();
	  b.wheel();
	  b.mirror();
	  b.test();
}
}
