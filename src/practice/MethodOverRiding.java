package practice;

class Students
{
 	public String studentname(String name)
 	{
 		System.out.println("this is version1 "+name);
 		return name;
 	}
}
class Students1 extends Students
{
  public String studentname(String name)
  {
	  //super.studentname(name);
	  System.out.println("this is version2 "+name);
	  return name;
  }
}
public class MethodOverRiding 
{
    public static void main(String[] args) {
		Students1 s=new Students1();
		s.studentname("anil");
		System.out.println();
		
    	
	}
}
