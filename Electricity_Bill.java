import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a= s.nextLine();
        String b=s.nextLine();
       double e=0,d,c=s.nextInt();
        if(c<=199){
             d= c*1.20;
             if(d>400){
           e=d*0.15;
             }
           if(e<100){
               e=100.00;
           }
               System.out.printf("%.2f",e+d);
        }
        else if(200<=c&&c<400){
             d= c*1.50;
             if(d>400){
           e=d*0.15;}
          
           if(e<100){
               e=100.00;
           }
               System.out.printf("%.2f",e+d);
        }
        else if(400<=c&&c<600){
            
           d= c*1.80;
           if(d>400){
           e=d*0.15;
           }
          
           if(e<100){
               e=100.00;
           }
               System.out.printf("%.2f",e+d);
        }
        else if(c>=600){
            d= c*2.00;
           e=d*0.15;
           
           if(e<100){
               e=100.00;
           }
               System.out.printf("%.2f",e+d);
        }
}
}
