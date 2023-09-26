package JavaPgms;

class Message
{
	public void send(int a,String b)
	{
		System.out.println(b+":"+a);
	}
	public void send(String c,String d)
	{
		System.out.println(c+":"+d);
	}
}

public class MethodOverloading 
{
  public static void main(String[] args) {
	Message mg=new Message();
	mg.send(143, "Hi");
	mg.send("hello", "to you");
}
}
