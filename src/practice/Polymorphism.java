package practice;

class Anil
{
  public void name()
  {
	  System.out.println("my name is anil");
  }
}

class Nagaraj extends Anil
{
  public void name()
  {
	  System.out.println("my friend name is nagaraj");
  }
}
class Arun extends Anil
{
 public void name()
 {
   System.out.println("my senior name is arun");	
 }
}
public class Polymorphism 
{
  public static void main(String[] args) 
  {
	  Anil a;
	       a=new Anil();
	       a.name();
           a=new Nagaraj();
           a.name();
           a=new Arun();
           a.name();
  }
}
