package practice;

enum Status
{
  Active,Inactive,Maintanence;	
}
//enum Employees
//{
//  	Anil(1000),Nagaraj(2000),Arun(3000),Bharath(4000),Srikanth(5000);
//   
//	private int salary;
//     
//    private Employees(int salary)
//    {
//    	this.salary=salary;
//    }
//    
//    public int getsalary()
//    {
//    	return salary;
//    }
//    public void setsalary(int salary)
//    {
//    	this.salary=salary;
//    }
// 
//}

public class EnamClass 
{
  public static void main(String[] args) {
	Status[] s=Status.values();
	//Status s1=Status.Inactive;
	//Status s2=Status.Maintanence;
	//System.out.println(s1+"    : "+s1.ordinal());
//	System.out.println(s2+" : "+s2.ordinal());
//
	for (Status ss : s) {
	System.out.println(ss+" : "+ss.ordinal());	
	}
	 
//	  Employees e=Employees.Anil;
//	  System.out.println(e+":"+e.getsalary());
	  
}
}
