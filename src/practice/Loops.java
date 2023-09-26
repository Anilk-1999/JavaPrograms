package practice;

//OUTPUT
//*
//**
//***
//****
//*****

//public class Loops 
//{
//   public static void main(String[] args) {
//	
//	   for(int i=1;i<=5;i++)
//	   {
//		   for(int j=1;j<=i;j++)
//		   {
//		   System.out.print("*");
//	   }
//		   System.out.println();
//	   }
//}
//}




//OUTPUT
//*****
//****
//***
//**
//*

//public class Loops 
//{
//   public static void main(String[] args) {
//	
//	   for(int i=5;i>=1;i--)
//	   {
//		   for(int j=1;j<=i;j++)
//		   {
//		   System.out.print("*");
//	   }
//		   System.out.println();
//	   }
//}
//}


//OUTPUT
//1
//22
//333
//4444
//55555

//public class Loops 
//{
//   public static void main(String[] args) {
//	
//	   int num = 1;
//	   for(int i=1;i<=5;i++)
//	   {
//		   for(int j=1;j<=i;j++)
//		   {
//		   System.out.print(num);
//	   }
//		   System.out.println();
//		   num++;
//	   }
//}
//}


//public class Loops
//{
//public static void main(String[] args) {
//	
//	int n=1;
//	
//	while(n<=2)
//	{
//		if(n==2)
//		{
//		System.out.println(n);
//	
//	}
//		else {
//			System.out.println("condition fail");
//		}
//		n++;
//	}
//	
//}	
//}



//public class Loops
//{
//public static void main(String[] args) {
//	
//	int n=10;
//	
//	do
//	{
//		System.out.println(n);
//		n++;
//	}while(n<=1);
//	
//}	
//}
//



public class Loops
{
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		int find=2;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find) 
			{
				System.out.println(arr[i]);
			}
//			System.out.println(arr[i]);

		}	

	}
}
