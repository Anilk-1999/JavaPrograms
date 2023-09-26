package JavaPgms;


//without innerClass as static 

//class OuterClass
//{
//	String name ="Anil";     //can declaring the variable
//	
//	public void outerclassMethod() // can declare the method
//	{
//		System.out.println("this is outerclass method");
//	}
//	
//  class InnerClass
//  {
//	  public void innerclassMethod()
//	  {
//		  System.out.println("this is innerclass method");
//	  }
//  }
//}
//
//public class InnerClasses 
//{
// public static void main(String[] args) {
//	OuterClass oc=new OuterClass();
//	oc.outerclassMethod();
//	OuterClass.InnerClass ic=oc.new InnerClass();
//	ic.innerclassMethod();
//	
//
//	
//}
//}






//made innerClass as static 

class OuterClass
{
	String name ="Anil";
	
	public void outerclassMethod() 
	{
		System.out.println("this is outerclass method");
	}
	
  static class InnerClass   //declare the inner class as static
  {
	  public void innerclassMethod()
	  {
		  System.out.println("this is innerclass method");
	  }
  }
}

public class InnerClasses 
{
 public static void main(String[] args) 
 {
	OuterClass oc=new OuterClass();
	oc.outerclassMethod();
	OuterClass.InnerClass ic=new OuterClass.InnerClass();
	ic.innerclassMethod();
}
}
