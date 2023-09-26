package practice;


abstract class Car
{
  public abstract void flay();
  
  public void wheel()
  {
	  System.out.println("hey i am car wheel");
  }
}
abstract class Car1 extends Car
{
	public abstract void steering();
	public void flay()
	{
		System.out.println("hey i am flay");
	}
}
class Car2 extends Car1
{
  public void steering()
  {
	  System.out.println("hey i am steering");
  }
}
public class Abstract 
{
  public static void main(String[] args) {
	Car2 c=new Car2();
	c.wheel();
	c.flay();
	c.steering();
}
}
