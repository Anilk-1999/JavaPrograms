package JavaPgms;

enum Testers
{
	Anil,Nagaraj,Arun,Sandeep;
}

public class Enamclass 
{
public static void main(String[] args) {
   Testers t=Testers.Anil;
   System.out.println(t+" print the object");
   System.out.println(t.ordinal()+"    print the index of the object");
}
}
