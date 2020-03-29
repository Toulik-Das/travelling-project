/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelling.data;

/**
 *
 * @author KIIT
 */
import java.io.InputStream;
import java.util.Scanner;
public class TravellingData {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
 intro();
 budget();
 time();
 distance();
    }
 public static void intro(){
     Scanner input=new Scanner(System.in);
      System.out.println("Wellcome to Travelling Data Sequrity company ");
      System.out.println("Whats your Full name?(without any spaces):\n");
      String name=input.next();
System.out.println("Nice to meet you  "+name+"  wellcome to Our teavell Agency");
   System.out.println("where are you from?:\n");
   String home=input.next();
   System.out.println("OK ...Thanks for comming to our company from  "+home);
   System.out.println("what is you dream place you want to travell in the vication?:\n");
 String place=input.next();
 System.out.println("Wow! Thats sounds great "+place);
 System.out.println("wish you travell the place with lot of enjoy ment . for any problem IN Time of travelling contact with us in the mobile no.:8918774037(Toulik das) ");
 }
 public static void budget(){
Scanner input=new Scanner(System.in);
  System.out.println("How many days you travell there?:\n");
  int day=input.nextInt();
  System.out.println("How much money you want to spend in this trip in Rupee?:\n");
  double money=input.nextDouble();
  System.out.println("what is the three currency symbole of the travelling destination:\n");
  String curr=input.next();
  System.out.println("How many "+curr+"  in one rupee ?:\n");
  double bit=input.nextDouble();
System.out.println("IF YOU TRAVELLING FOR"+day+"days that is same as "+day*24+" hours or "+day*24*60+"minutes");
System.out.println("If you going to spend\t"+money+" rupee that means per day you can spend\t"+money/day+"rupee");
System.out.println("Total budegt in  "+curr+" is $"+(money*bit) + curr+".\tSo per day you can spend money in "+ curr+" is"+(money*bit)/day+curr);
}
public static void time(){
    Scanner input=new Scanner(System.in);
    System.out.println("What is time zone difference in hours between your home destination?:");
    double time_zone_dif=input.nextDouble();
    double x=12+time_zone_dif;
    if(x<=23.99){
        System.out.println("So when its 12:00 o'clock here then its "+x+"o'clock in your destination place");
    } else {
       System.out.println("So when its 12:00 o'clock here then its aprox. 0:00 o'clock in your destination place");
    }
    System.out.println("And when its 0:00 o'clock here then its "+time_zone_dif+" o'clock in desti nation place");
  }
public static void distance(){
   Scanner input=new Scanner(System.in);
   System.out.println("Use Google and say What is the lattitud of your home location:\t");
   double lattitude=input.nextDouble();
   System.out.println("Use Google and say What is the longitude of your home location:\t");
   double longitude=input.nextDouble();
   System.out.println("you home locations lattitude is North(N) or South(S):\t");
   String NS=input.next();
   System.out.println("you home locations longitude is East(E) or West(W):\t");
   String EW=input.next();
   System.out.println("Use Google and say What is the lattitude of your destination location:\t");
   double lattitude_des=input.nextDouble();
   System.out.println("Use Google and say What is the lattitude of your destination location:\t");
   double longitude_des=input.nextDouble();
   System.out.println("you DESTINATION locations lattitude is North(N) or South(S):\t");
   String NS_des=input.next();
   System.out.println("you DESTINATION locations longitude is East(E) or West(W):\t");
   String EW_des=input.next();
   System.out.println("So Your home's location is:\t"+lattitude+" deg"+NS+" , "+longitude+" deg"+EW);
   System.out.println("So Your destination's location is:\t"+lattitude_des+" deg  "+NS_des+" , "+longitude_des+" deg  "+EW_des);
   double a=lattitude_des-lattitude;
   double b=longitude_des-longitude;
   double sin_val=Math.sin(a/2);
   double sin_val1=Math.sin(b/2);
   double c=Math.cos(lattitude);
   double d=Math.cos(lattitude_des);
   double e=(sin_val*sin_val+c*d*sin_val1*sin_val1);
   double f=Math.sqrt(e);
   double g=2*6371*Math.asin(f);
   System.out.println("So distance of your destination place form your home town in kilomiters is:  "+g+" Km");
   System.out.println("So distance fom your home to destination place in miles: "+g*0.621+" miles");
}    

    private static void Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
