package practice;

import java.util.Objects;

class B
{
	int a;
	int b;
	
	public void method()
	{
		System.out.println(a+b);
	}	
	public String toString() {
		return "B [a=" + a + ", b=" + b + "]";
	}
	
	public int hashCode() {
		return Objects.hash(a, b);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		return a == other.a && b == other.b;
	}
}
public class A
{
  public static void main(String[] args) 
  {
	B b1=new B();
	{
		b1.a=10;
		b1.b=20;
		b1.method();
		B b2=new B();
		{
			b2.a=10;
			b2.b=20;
			b2.method();

		 boolean result=b1.equals(b2);
		 System.out.println(result);
			
	}
  }	
}
}
