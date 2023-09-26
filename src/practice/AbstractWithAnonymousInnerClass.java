package practice;

 abstract class TechActive
{
  public abstract void hiringDev();
  public abstract void hiringTester();
  
}
 
public class AbstractWithAnonymousInnerClass 
{
 public static void main(String[] args) {
	 TechActive ta=new TechActive()
			{
	         
			   public void hiringDev()
	           {
	        	   System.out.println("hey i am developer");
	           }
	           public void hiringTester()
	           {
	        	   System.out.println("hey i am tester");
	           }
			};
			ta.hiringDev();
			ta.hiringTester();	
}
}
