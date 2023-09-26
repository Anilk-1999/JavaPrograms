package practice;




public class Array 
{
   public static void main(String[] args) 
   {
	    int arr[][]=new int[3][];
	     arr[0]=new int[2];
	     arr[1]=new int[3];
	     arr[2]=new int[4];
	     
	   	    {
			for(int i=0;i<arr.length;i++)
			{
				for (int j = 0; j < arr.length; j++) {
					int random = (int)(Math.random()*100);
					System.out.print(random+ " ");	
				}
				System.out.println();
				
			}
		}
	    	    
}
}
