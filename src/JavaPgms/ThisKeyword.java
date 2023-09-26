package JavaPgms;


class This
{
 public void first()
 {
	 System.out.println("hello i am first");
 }
 public void second()
 {
	this.first();
 }
}

public class ThisKeyword 
{
  public static void main(String[] args) {
	This t=new This();
	t.second();
}
}
