package practice;


class OuterClass
{
  public void outermethod()
  {
	  System.out.println("hey i am outermethod");
  }
  
  static class InnerClass
  {
	  public void innermethod()
	  {
		  System.out.println("hey i am innermethod");
	  }
  }
}

public class InnerClasses 
{
  public static void main(String[] args) {
	OuterClass oc=new OuterClass();
			oc.outermethod();
    OuterClass.InnerClass oi=new OuterClass.InnerClass();
            oi.innermethod();
  }
}
