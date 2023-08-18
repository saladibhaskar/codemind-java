import java.util.Scanner;
public class Sb{
    public static void main(String[] ars)
    {
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int n2=s.nextInt();
    int x=s.nextInt();
    int i,c=0;
    if(n2<n1)
    {
        System.out.print("-1");
    }
    else
    {
        int a=x;
        int b=0;
        i=0;
        while(a>=b)
        {
            a=n1+a;
            b=n2+b;
            i++;
        }
        {
          System.out.print(i);
        }
    }
        
    }
    
}