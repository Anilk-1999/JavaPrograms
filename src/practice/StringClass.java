package practice;

public class StringClass 
{
   public static void main(String[] args) {
	   
	   String name=new String("ANIL"+" KUMAR");
	   name.charAt(1);
	   name.concat("arun");
	   name.replace('A', 'B');
	   System.out.println("hello boss i am "+name);
       
	   StringBuffer sb=new StringBuffer();
	   sb.append("arun");
	   System.out.println(sb);
	   sb.charAt(2);
	   sb.replace(0, 0, "A");
	   sb.deleteCharAt(1);
	   sb.insert(4, " kumar");
	   sb.reverse();
	   sb.indexOf("rA");
	   System.out.println(sb);
	   
}
}
