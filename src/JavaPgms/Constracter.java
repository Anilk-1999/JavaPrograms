package JavaPgms;


class Storage
{
	private int age;
	private String name;
	private String location;

public Storage()
{
	age=10;
	name="anil";
	location="mysore";
}

public Storage(int age,String name,String location)
{
	this.age=age;
	this.name=name;
	this.location=location;
}

public int getage()
{
return age;	
}
//public void setage(int a)
//{
//age=a;	
//}

public String getname()
{
return name;	
}
//public void setname(String n)
//{
//name=n;	
//}

public String getlocation()
{
 return location;	
}
//public void setlocation(String l)
//{
//	location=l;
//}

}
public class Constracter 
{
	public static void main(String[] args) {
	
  Storage s=new Storage();
  Storage s1=new Storage(20,"anil kumar","mysoru");
  {

	  System.out.println(s.getname()+":"+s.getage()+":"+s.getlocation());
	  System.out.println("my name is : "+s1.getname()+"   my age is : "+s1.getage()+"  my location is : "+s1.getlocation());  
  }		  
}
}
