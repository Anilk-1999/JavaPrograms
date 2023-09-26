package JavaPgms;

enum DevelopersSalary 
{
	Srikanth(1000), Bharath(2000), Sanjay(3000), Hari(4000), Vikas;

	private int salary;

	DevelopersSalary() 
	{
		salary = 5000;
	}

	private DevelopersSalary(int salary) 
	{
		this.salary = salary;
	}

	public int getsalary() {
		return salary;
	}

	public void setsalary(int salary) 
	{
		this.salary = salary;
	}
}

public class EnumWithConstructor 
{
	public static void main(String[] args) 
	{
		DevelopersSalary[] ds = DevelopersSalary.values();
		for (DevelopersSalary sal : ds) 
		{
			System.out.println(sal + " : my salary  " + sal.getsalary());
			System.out.println();
		}
	}
}
