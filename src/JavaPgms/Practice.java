package JavaPgms;


class Sample
{
	String name;
	static int salary ;
	String location ;

	public Sample()
	{
		System.out.println("hello i am constractor");
	}

	static 
	{
		System.out.println("hello i am static");
	}

	public void print() 
	{
		if(salary>=2001)
		{
			System.out.println("Big salary");	
		}
		else
		{
			System.out.println(name+":"+salary+":"+location);

		}
	}
}
class Demo
{
	private String name;
	private String location;
	private int salary;

	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		name=n;
	}

	public String getlocation()
	{
		return location;	 
	}
	public void setlocation(String l)
	{
		location = l;
	}

	public int getsalary()
	{

		return salary;
	}
	public void setsalary(int s)
	{
		salary = s;
	}

	public Demo(String name,int salary,String location)
	{
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

}

class Super
{

	public Super()
	{
		System.out.println("hello i am super constractor");
	}
	
	public void display()
	{
		 int a=10;
	}
}
class Subclass extends Super
{
  public Subclass()
  {
	  System.out.println("hello i am subclass");
  }
  public void display()
  {
	 int a=20;
	 System.out.println(a);
	 //System.out.println(super.a);
	 super.display();
	 
  }
  public void show()
  {
	  System.out.println();
  }
}


public class Practice 
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		{
			for (int i = 0; i < 3; i++) {
				s.name="anil";
				Sample.salary=1000;
				s.location="mysore";
				s.print();
				for (int j = 0; j < 3; j++) {

					Sample s1=new Sample();
					{
						s1.name="arun";
						Sample.salary=2000;
						s1.location="bangalore";
						s1.print();


						s.name="neenur";
						s.location="mysr";
						System.out.println(s.name);
					}
				}
			}
		}

		String name= new String("anil"+" kumar");
		name ="arun";
		System.out.println(name);

		StringBuffer sb=new StringBuffer();
		{

			sb.append("anil");
			sb.append(" kumar");
			//String st=sb.toString();
			sb.setLength(30);
			sb.insert(10, " java");
			sb.charAt(5);
			sb.setCharAt(1, 'p');
			sb.deleteCharAt(1);
			sb.setCharAt(1, 'n');
			sb.setCharAt(2, 'i');
			sb.replace(0, 3, "anil");
			//sb.length();
			System.out.println(sb); 
			sb.ensureCapacity(13);



			Demo d=new Demo("anil",1000,"bangalore");
			{
				System.out.println(d.getlocation()+" "+""+d.getname()+" "+d.getsalary());

				d.setlocation("mysore");
				d.setname("arun");
				d.setsalary(2000);

				System.out.println(d.getlocation()+" "+""+d.getname()+" "+d.getsalary());

			}
		}
		
		Subclass sub=new Subclass();
		{
			sub.display();
			//sub.shown();
			System.out.println(sub);
		}
	}  
}
