package practice;


interface Computer
{
   void code();
}
class Laptop implements Computer
{
 public void code()
 {
	 System.out.println("code,campile,run...");
 }
}
class Detktop implements Computer
{
  public void code()
  {
	  System.out.println("code,campiler,fastrunner");
  }
}
class Tester
{
  public void testApp(Computer lap)
  {
	  lap.code();
  }
}
public class Demo 
{
   public static void main(String[] args) {
	   Computer lap=new Laptop();
	   Computer desk=new Detktop();
	   Tester anil=new Tester();
       anil.testApp(desk);
       
}
}
