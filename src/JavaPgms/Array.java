package JavaPgms;

import java.beans.Statement;
import java.util.Iterator;
import java.util.Random;

import javax.print.DocFlavor.STRING;


class Students
{
  static String Name;
  int RoleNo;
  int Marks;
  
	public void sure()
	{
		System.out.println(Name+" : "+RoleNo+" : "+Marks);
	}

}

public class Array 
{
   public static void main(String[] args) 
   {	   
//	   
////	 int a1=10;
////	 int a2=20;
////	 int a3=30;
//	   
////		 int a=a1+a2+a3;
////		 if(a<20)
////		 {
////		 System.out.println("this is not value of a :"+ a2);
////		 }
////		 else {
////			 System.out.println("this is value of a :"+a);
////		 }
//	 
//	// int arr[]= {1,5,3,4};
//	 
	int arr[][]=new int[3][4];
	
//	arr[0]=20;
//	arr[1]=15;
//	arr[2]=12;
//	arr[3]=5;
	   
	   for (int i = 0; i <arr.length; i++) {
		 for(int j=0;j<=arr.length;j++)
		 {
			 int random=(int)(Math.random()*100);
			 System.out.print(random+" ");	 
		 }
		 System.out.println();
//		 
//		 
//		
//	}
//	   System.out.println();
//	  
//	   // foreach loop
//	   for(int n[]:arr)	
//	   {
//		   for (int m :n) {
//			   int arra=(int)(Math.random()*10);
//			   System.out.print(arra+ " ");
//			
//		}
//		   System.out.println();
//	   }
//	   
//	   System.out.println();
//	   
//	   int num[][]=new int[3][]; // jagged method array
//	   
//	   num[0]=new int[5];
//	   num[1]=new int[3];
//	   num[2]=new int[8];
//	   	
//	   num[2]=new int[11];
//	   
//	   for (int i = 0; i < num.length; i++) {
//		for (int j = 0; j < num[i].length; j++) {
//             num[i][j]=(int)(Math.random()*10);
//             System.out.print(num[i][j] + " ");
//		}
//		System.out.println();
//	}
//	   
//	   System.out.println();
//	   //three dimentional array
//
//	   int array[][][] = new int[3][2][4];
//	   
////	    array[0][0]=new int[4];
////	    array[1][1]=new int[6];
////	    array[2][2]=new int[2];
//	   
//	   
//	   for (int i = 0; i < 3; i++) {
//		 // System.out.println(array.length);
//	for (int j = 0; j < 2; j++) {
//		//System.out.println(array.length);
//			for (int k = 0; k < 4; k++) {
//				//System.out.println(array.length);
//				 array[i][j][k]=(int)(Math.random()*100);
//				System.out.print(array[i][j][k]+" ");
//			}
//			System.out.println();
//		}
//	}
	   
//	   Students stu1 = new Students();
//	   Students.Name="Anil";
//	   stu1.RoleNo=01;
//	   stu1.Marks=35;
//	   
//	   Students stu2 = new Students();
//	   Students.Name="Nagaraj";
//	   stu2.RoleNo=02;
//	   stu2.Marks=95;
//	  
//	   Students stu3=new Students();
//	   Students.Name="Bharath";
//	   stu3.RoleNo=03;
//	   stu3.Marks=96;
	   
//	 Students students[]=new Students[3];
//	 
//	students[0]=stu1;
//	students[1]=stu2;
//	students[2]=stu3;
//	
////	for(int i=0;i<students.length;i++)
////	{
////		System.out.println(students[i].Name +":"+ students[i].Marks + ":"+students[i].RoleNo);
////	}
//	
//	//foreach loop
//
//	for(Students stud : students)
//	{
//		System.out.println(stud.Name +":"+ stud.Marks + ":"+stud.RoleNo);
//	}
//		
//	System.out.println();
//	
//	
//	//String concept  -- > it is a immutable String it can't change
//	
//	String name=new String("Anil kumar");
//	
//	System.out.println(name);
//    System.out.println("Hello "+name);
//    System.out.println(name.concat(" how are you"));
//    System.out.println(name.charAt(5));
//	System.out.println(name.hashCode());
//	System.out.println((float)name.indexOf(2));
//	
//	System.out.println();	
//	
//	String name1= "anil";
//	name1=name1+" kumar";
//	
//	String n1="ANIL";
//	String n2="ANIL";
//	System.out.println(n1);
//	System.out.println(n1==name1);
//	System.out.println(n1==n2);
//	System.out.println();
//	
//	
//	//StringBuffer concept  -- > it is a mutable String -- > it can change
//	
//	StringBuffer sb=new StringBuffer("Anil");
//	
//	sb.append(" anil");
//	sb.append(" "+ true);
//	sb.append(" ani");
//	sb.append(sb);
//	sb.insert(1, " anu");
//	sb.deleteCharAt(11);
//	//sb.setLength(15);
//	sb.length();
//	sb.substring(5, 10);
//	sb.ensureCapacity(200);
//	String str=sb.toString(); //-- this is convert from StringBuffer to String
//	System.out.println(sb);
//	
//    Students s1=new Students();
//    Students.Name="Arun";
//    s1.RoleNo=01;
//    s1.Marks=92;
//    
//	
//    Students s2=new Students();
//    Students.Name="Kiran";
//    s2.RoleNo=02;
//    s2.Marks=85;
//	
//    Students s3=new Students();
//    Students.Name="Anil";
//    s3.RoleNo=03;
//    s3.Marks=52;
//    
//    s1.sure();
//    s2.sure();
//    s3.sure();
    
    
    
	
 }
   }
}
