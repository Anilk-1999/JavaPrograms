package JavaPgms;

class Whatsapp
{
   public void app()
   {
	   System.out.println("audio call only");
   }
}
class WhatsappV1 extends Whatsapp
{
   public void app()
   {
	   System.out.println("both audio and vidio call");
   }
}

public class MethodOverriding 
{
public static void main(String[] args) {
	WhatsappV1 wh= new WhatsappV1();
    wh.app();           
}
}
