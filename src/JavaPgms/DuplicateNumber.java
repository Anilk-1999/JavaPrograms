package JavaPgms;

public class DuplicateNumber 
{
	public static void main(String[] args) {
		
   int arr[]= {1,2,3,3,2,1,5,2};
   
   for(int i=0;i<arr.length;i++)
   {
	   for(int j=i;j<arr.length;j++)
	   {
		 if(arr[i]==arr[j])
		  {
	        System.out.println(arr[i]);
	      }
	   }
   }
}
}