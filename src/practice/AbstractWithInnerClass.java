package practice;

abstract class Bus_v1
{
  public abstract void wheel();
  public abstract void mirror();
  public void steering()
  {
	  System.out.println("hey this is steerig");
  }
  static class Bus_v2 extends Bus_v1
  {
	  public void wheel()
	  {
		  System.out.println("hey this is wheel");
	  }
	  public void mirror()
	  {
		  System.out.println("hey this is mirror");
	  }
  }
}
public class AbstractWithInnerClass 
{
   public static void main(String[] args) {
	   Bus_v1.Bus_v2 b1=new Bus_v1.Bus_v2();
	   b1.steering();
	   b1.wheel();
	   b1.mirror();
}
}
