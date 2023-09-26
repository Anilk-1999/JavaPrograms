package practice;

import JavaPgms.SwichCase;

public class Conditional 
{
   public static void main(String[] args) {
	
//	   int a=10;
//	   int b=20;
//	   int c=15;
//	  
//	   if(a>=b & a>=c)
//	   {
//		   System.out.println(a+"is the largest number");
//	   }
//	   else if(b>=a & b>=c)
//	   {
//		   System.out.println(b+" is the largest number");
//	   }
//	   else
//	   {
//
//		   System.out.println(c+" is the largest number");
//	   }
	   
	   
	   int a=14;
	   int b=13;
	   int c=15;
	  
	   if(a>=b || a>=c)
	   {
		   System.out.println(a+" is the largest number");
	   }
	   else if(b>=a || b>=c)
	   {
		   System.out.println(b+" is the largest number");
	   }
	   else
	   {

		   System.out.println(c+" is the largest number");
	   }
	   
	   int input = 10;
	   
	   switch(input)
	   {
      
	   case 1:
		   System.out.println("Anil");
		   break;
	   case 2:
		   System.out.println("Arun");
		   break;
	   case 3:
		   System.out.println("Ashwini");
	       break;
	   default:
		   System.out.println("NOT FOUND !!! Please Enter The Valid Input");
	    	   
	   }
	   }
}
