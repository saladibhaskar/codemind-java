 import java.util.Scanner;
 public class Pt
 {
     public static void main(String[] ds)
     {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int i,j;
         for(i=n;i>0;i--)
         {
             for(j=i;j>0;j--)
             {
                 System.out.print((char)(64+i)+" ");
             }
             System.out.print("
");
         }
     }
 }