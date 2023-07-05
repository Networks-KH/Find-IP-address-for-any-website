import java.net.*;
import java.util.Scanner;

class WebsiteIP
{
    public static void main(String[] args) throws Exception{
        InetAddress obj1;
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Write the Web page name with domain like this format 'www.WebsiteName.com' : ");
        String webName = obj2.nextLine();
        obj1 = InetAddress.getByName(webName);
        System.out.println("The IP for this website is: "+obj1);
        //Here is another function, it is give you the IP your device 
        obj1 = InetAddress.getLocalHost();
        System.out.println("Your local IP is: "+obj1);
     
    }
}
