package practice;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a = 18 / 1;
		}
		catch (Exception e)
		{
			System.out.println("hello" + e);
		}
		System.out.println("hello sir");
	}
}