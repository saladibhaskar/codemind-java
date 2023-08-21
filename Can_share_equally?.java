import java.util.Scanner;
public class sb{
    public static void main(String [] ars)
    {
    Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int y=sc.nextInt();
     String a;
     if(x==0 &&y%2==0)
     {
         a="YES";
     }else if(x%2==0&&x!=0)
     {
         a="YES";
     } 
     else{
         a="NO";
     }
     System.out.print(a);
    }
}