package JavaPgms;

enum Subjects
{
	 Maths,Chemistry,Physics,Biology;
}

public class EnamWithIfCondition 
{
   public static void main(String[] args) {
	
	   Subjects[] sub=Subjects.values();
	   for(Subjects ss:sub)
	   {
		   System.out.println(ss+":"+ss.ordinal());
	   }
	   
	System.out.println();   
	   
	   Subjects s=Subjects.Maths;
	
	if(Subjects.Biology==s)
	{
	   System.out.println("The biology of the index is : "+s.ordinal());	
	}
	else if(Subjects.Maths==s)
	{
		System.out.println("The maths of the index is : "+s.ordinal());
	}
	else if(Subjects.Chemistry==s)
	{
		System.out.println("The chemistry of the index is : "+s.ordinal());
	}
	else if(Subjects.Physics==s)
	{
		System.out.println("The physics of the index is : "+s.ordinal());
	}
	else
	{
		System.out.println("please enter valid input");
	}
}
}
