import java.util.Scanner;
public class add{
    static int  prime(int n)
    {
        for(int i=2;i<=(n/2)+1;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    static int pal(int n)
    {
        int rev=0,rem,t=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==t)
        {
            return 1;
        }else{
            return 0;
        }
        
    }
public static void main(String[] args)
{
 
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();
 for(int i=a+1;;i++)
 {
     if(prime(i)==1 && pal(i)==1)
     {
         System.out.print(i);
         break;
     }
 }
 
}
}