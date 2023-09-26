package practice;

//#1 if use the final class can't inherit  

//final class Techactive
//{
//	String name="Anil kumar";
//	public void name()
//	{
//		System.out.println(name);
//	}
//}



//#2 can't change the variables when make variable as a final 


//class Techactive
//{
//	 final String name="Anil kumar";
//	
//	
//	public void name()
//	{
//		 name="Anil";
//		System.out.println(name);
//	}
//}



//#3 can't overRide the method when final method

//class Techactive
//{
//	  String name="Anil kumar";
//	
//	
//	public final void name()
//	{
//		 name="Anil";
//		System.out.println(name);
//	}
//}
//
//
//class Techactive1 extends Techactive
//{
//	String name="Arun";
//	
//	public void name()
//	{
//		
//		System.out.println(name);
//	}
//}


class Techactive
{
	  String name="Anil kumar";
	
	
	public void name()
	{
		 name="Anil";
		 System.out.println(name);
	}
}


class Techactive1 extends Techactive
{
	String name="Arun";
	
	public void name()
	{
		
		System.out.println(name);
	}
}

public class FinalKeyword 
{
  public static void main(String[] args) {
	  Techactive1 ta=new Techactive1();
	  ta.name();
			  
}
}
