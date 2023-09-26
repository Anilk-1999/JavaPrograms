package JavaPgms;

enum Family
{
 Anil,Arun,Ashwini,Girijamma,Mahadevaswamy;	
}

public class EnamPrintAllObjects 
{
   public static void main(String[] args) {
	Family[] f=Family.values();
	for(Family ff:f)
	{
		System.out.println(ff+" : "+ff.ordinal());	
	}
	
}
}
