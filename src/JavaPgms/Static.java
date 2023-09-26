package JavaPgms;

class Static1
{
	static	char Eid;
	String Ename;
	int Esal;
	
	static 
	{
		System.out.println("hi hello guys i am static");
	}

	
	public Static1()
	{
	
		System.out.println("hello i am constracter");
	}
	
	public static void main()
	{
		
	}
	
	public void show()
	{
		System.out.println("Employee name : "+Ename+","+ " Employee id : " +Eid+","+" Employee salary : "+Esal);
	}

}



public class Static 
{
     public static void main(String[] args) {
	
    	 Static1 st1=new Static1();
    	 
    	 st1.Ename="anil";
    	 Static1.Eid= 'A';
    	 st1.Esal=1000;
    	 
    	 Static1 st2=new Static1();
    	 st2.Ename="arun";
    	 Static1.Eid= 'B';
    	 st2.Esal=2000;
    	 
    	 Static1 st3=new Static1();
    	 st3.Ename="ashwini";
    	 Static1.Eid= 'C';
    	 st3.Esal=3000;
    	 
    	 st1.show();
    	 st2.show();
    	 st3.show();
    	 

    	 
	}
}
