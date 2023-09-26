package practice;

//1*Add two number with in one class

//class AddTwoNumber
//{	
//	public static void main(String[] args) 
//	{
//		int a;
//		int b;
//		int result;
//
//		a=10;
//		b=20;
//		result=a+b;
//
//		System.out.println("A+b = "+result+" ---> This is add two number");
//
//	}	
//}

//2* This is add two number by using two classes
//class Add
//{
//	int a;
//	int b;
//	int result;
//	
//	public void show()
//	{
//		result=a+b;
//		System.out.println("A+b = "+result+" ---> This is add two number");
//	}
//}
//
//class AddTwoNumber
//{
//public static void main(String[] args) {
//
//	Add add=new Add();
//	add.a=10;
//	add.b=20;
//	add.show();
//}	
//}

//3*This is add two number by using constructor
//class Add
//{
//	int a;
//	int b;
//	int result;
//
//	public Add()
//	{
//		a=10;
//		b=20;
//		result=a+b;
//	}	
//	public void show()
//	{
//		System.out.println(result);
//	}
//}
//class AddTwoNumber
//{
//	public static void main(String[] args) 
//	{
//		Add add=new Add();
//		{
//			add.show();	
//
//		}
//	}	
//}

//4* Add two number by using parameterized constructor
//class Add
//{
//	int a;
//	int b;
//	int result;
//
//	public Add(int a,int b)
//	{
//		this.a=a;
//		this.b=b;
//		result=a+b;
//	}	
//	public void show()
//	{
//		System.out.println(result);
//	}
//}
//class AddTwoNumber
//{
//	public static void main(String[] args) 
//	{
//		Add add=new Add(10,20);
//		{
//			add.show();	
//
//		}
//	}	
//}

//4* Add two number by using parameter 
class Add {
	static int a;
	static int b;
	static int result;

	public void show(int a, int b) {
		this.a = a;
		this.b = b;
		result = a + b;
		System.out.println(result);
	}
}

class AddTwoNumber {
	public static void main(String[] args) {
		Add add = new Add();
		{
			add.show(10, 20);

		}
	}
}