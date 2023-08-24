import java.util.Scanner;
public class add{
   
public static void main(String[] args)
{
 
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 String k="";
 int c=0;
 for(int i=1;i<=7;i++)
 {
     //if(i==3||i==5||i==7)
     {
     if(n%3==0 &&i==3)
     {
       k+="Pling";  
       c++;
     }else if(n%5==0 &&i==5)
     {
         k+="Plang";
         c++;
     }else if(n%7==0&&i==7)
     {
         k+="Plong";
         c++;
     } 
    }}
    if(c==0)
    {
        System.out.print(n);
    }else{
     System.out.print(k);}
 
}
}