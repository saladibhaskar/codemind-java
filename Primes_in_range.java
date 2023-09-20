import java.util.*;
public class Sn{
    static boolean isPrime(int n)
    {
        if(n==1||n==0)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]as)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}