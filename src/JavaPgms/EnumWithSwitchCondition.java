package JavaPgms;

enum Developers
{
  Srikanth,Bharath,Sanjay,Hari,Vikas;	
}

public class EnumWithSwitchCondition 
{
   public static void main(String[] args) {
	Developers d=Developers.Sanjay;
	
	switch(d)
	{
	case Srikanth:
		System.out.println(d+" : i am python developer!!! ");
		break;
	case Bharath:
		System.out.println(d+" : i am zoho developer!!! ");
		break;
	case Sanjay:
		System.out.println(d+" : i am frentend developer!!! ");
		break;
	case Hari:
		System.out.println(d+" : i am fullstack developer!!! ");
		break;
	default :
		System.out.println(d+" : i am angular developer!!! ");
	}
	
}
}
