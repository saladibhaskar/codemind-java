 import java.util.Scanner;
 public class Pt
 {
     public static void main(String[] ds)
     {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int i,j;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=i;j++)
             {
                 System.out.print(j);
             }
             System.out.print("
");
         }
     }
 }