package JavaPgms;

import java.text.BreakIterator;

class Calculator
{
	public String add(String a)
	{
		return a;
	}
	
	public void print()
	{
		int a =9;
		if(a>=11)
		{
		System.out.println("are you anil");
	    }
		else if(a==11)
		{
			System.out.println("where are you from");
		}
		else {
			System.out.println("no i am not a anil");
		}
	
	
	String name ="anil";
	
	if(name=="Anil")
	{
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	
	boolean tr = false;
	
	if(tr)
	{
		System.out.println("yes this is true");
	}
	else
	{
		System.out.println("yes this is false");
	}
	
}

public void switchcase()
{
   int name = 0;
   
   switch(name)
   {
   case 1 : 
	   System.out.println("hi i am anil");
	   break;
   case 2 :
	   System.out.println("hi i am nagaraj");
	   break;  
    case 3 :
	   System.out.println("hello are you arun i think your working at TECHACTIVE right");
	   break;   
    case 4 :
	   System.out.println("hi i am sandeep");
	   break;
   case 5 :
	   System.out.println("hi i am shruthi");
	   break;
   case 6 :
	   System.out.println("hi i am monika");
	   break;
   case 7 :
	   System.out.println("hi i am srikanth");
	   break;
   case 8 :
	   System.out.println("hi i am bharath");
	   break;
   case 9 :
	   System.out.println("hello are you sanjay i think your working at TECHACTIVE right");
	   break;
   case 10 :
	   System.out.println("hi i am hari");
	   break;
   default:
	   System.out.println("not found");
   }
   String ar1 ="Anil";
   String ar="anil";
   
   for(int i=1;i<11;i++)
   {
	   if(ar=="anil")
	   {
	   System.out.println(ar);
       }
	   else
	   {
		   System.out.println(ar1);
	   }
   }
   
  int a = 8;
   
  while(a<=10)
  {
    System.out.println(10);
    a++;
  }
  
  
   
}
}
public class Add_Two_Numbers 
{
  public static void main(String[] args) {
	 
	  Calculator cal =new Calculator();
	  String result=cal.add("Anil " + "kumar");
	  System.out.println(result);
	  cal.print();
	  cal.switchcase();
}
}

