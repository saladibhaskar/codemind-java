import java.util.Scanner;
public class add{
   
public static void main(String[] args)
{
 
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();
 int b=s.nextInt();
 int max=0,ele=0;
 for(int i=a;i<=b;i++)
 {
     int r=i,c=0;
     while(r!=1)
     {
         c++;
         if(r%2==0)
         {
             r=r/2;
         }else 
         {
             r=(3*r+1);
         }
         if(r==1)
         {
             break;
         }
     }
     if(c>max)
     {
         max=c;
         ele=i;
     }
 }
 System.out.print(ele);
  
 
}
}