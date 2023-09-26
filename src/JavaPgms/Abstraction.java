package JavaPgms;

abstract class Bike_v1
{
	public abstract void stand();
	public abstract void brack();
	public abstract void rim();

	public void wheel()

	{
		System.out.println("bike wheel here");
	}
}
abstract class Bike_v2 extends Bike_v1
{
	public abstract void seat();

	public void stand()
	{
		System.out.println("bike stand here");  
	}
	public void brack()
	{
		System.out.println("bike brack here");
	}
}
class Bike_v3 extends Bike_v2
{
	public void seat()
	{
		System.out.println("bike seat  here");
	}
	public void rim()
	{
		System.out.println("bike rim   here");
	}
}
public class Abstraction 
{
	public static void main(String[] args) 
	{
		Bike_v3 b=new Bike_v3();
		b.wheel();
		b.stand();
		b.brack();
		b.seat();
		b.rim();
	}
}
