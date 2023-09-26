package JavaPgms;

class Srikanth
{
	String job;
    int salary;
    String location;
    
	public void sri()
	{
	   job="Developer";
	   salary=3000;
	   location="Bangalore";
	   System.out.println(job+" : "+salary+" : "+location);

	}	
}
class Anil extends Srikanth
{
	String job;
    int salary;
    String location;

public void anil()
{
   	job="Tester";
    salary=1000;
   	location="Bangalore";
   	System.out.println(job+" : "+salary+" : "+location);  	
    System.out.println();
}
}

class Nagaraj extends Anil
{
	String job;
    int salary;
    String location;
    
  public void naga()
  {
	    job="Software Tester";
	    salary=2000;
	   	location="Bangalore";
	   	System.out.println(job+" : "+salary+" : "+location);  
       System.out.println();  
  }
}
public class Inheritence 
{
   public static void main(String[] args) {
    Nagaraj n=new Nagaraj();
    {
    	n.anil();
    	n.naga();
    	n.sri();
    }
   }
}
