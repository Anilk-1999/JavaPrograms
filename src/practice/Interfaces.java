package practice;

interface Names1
{
	 void anil();
	 void arun();
}
interface Names2
{
	void ashwini();
}
interface Names4 extends Names2 
{
    	
}
class Names3 implements Names1,Names4
{
   	public void anil()
   	{
   		System.out.println("hi i am anil");
   	}
   	public void arun()
   	{
   		System.out.println("hello i am arun");
   	}
   	public void ashwini()
   	{
   		System.out.println("hello guys i am ashwini");
   	}
}

public class Interfaces 
{
   public static void main(String[] args) {
	Names1 n1=new Names3();
	n1.anil();
	n1.arun();
	Names2 n2=new Names3();
	n2.ashwini();
}
}
