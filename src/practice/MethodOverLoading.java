package practice;

class Student
{
public void studentDetails(String name,String location)
{
	System.out.println("this is students details!!!........");
	System.out.println(name+" : "+location);
}
public void studentDetails(String standard,String subject,int fee)
{
	System.out.println(standard+" : "+subject+" : "+fee);
}

}
public class MethodOverLoading 
{
    public static void main(String[] args) {
		Student s=new Student();
		{
			s.studentDetails("Anil", "mysore");
			s.studentDetails("12  ", "Maths", 20000);
		    
		}
	}
}
