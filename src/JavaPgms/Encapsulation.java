package JavaPgms;

class Person // First one
{ 

	// private field
	private int age;

	// getter method
	public int getAge() 
	{
		return age;
	}

	// setter method
	public void setAge(int age) 
	{
		this.age = age;
	}	
}


class PersonAge // 2nd one
{
	private int age;

	public void setter(int age) 
	{
		this.age = age;
	}

	public int getter() 
	{
		return age;
	}
}



class PersonAge1 // 3rd one
{
	private int age1 = 21;
	private String name1 = "anil";
	private String location1 ="mysore";
	
	public int getage1()
	{
		return age1;
	}
	
	public void setage1(int a)
	{
		age1=a;
	}
	
	public String getname1()
	{
		return name1;
	}
	public void setname1(String n)
	{
		name1=n;
	}
	
	public String getloation1()
	{
		return location1;
	}
	public void setlocation1(String l)
	{
		location1=l;
	}
}

class Encapsulation 
{
	public static void main(String[] args) 
	{

		// create an object of Person
		Person p1 = new Person();

        // change age using setter
		p1.setAge(24);

		// access age using getter
		System.out.println("My age is " + p1.getAge());
     
		System.out.println();
		
		
		
		PersonAge pa = new PersonAge();
		{
			pa.setter(26);
			System.out.println("the persion age is " + pa.getter());
		}
		System.out.println();
		
		
	    	
		PersonAge1 pa1=new PersonAge1();
		{
			pa1.setage1(20);
			pa1.setlocation1("mysore1");
			pa1.setname1("ANIL");
			
			System.out.println(pa1.getname1() +" : "+pa1.getage1()+" : "+pa1.getloation1());
			
		}
	}
}