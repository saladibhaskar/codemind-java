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
        int a=n1+x;
        i=0;
        while(i<1000)
        {
            if(x+n1*i<n2*i)
            {
                System.out.print(i);
                c++;
                break;
            }
            i++;
            
        }
        if(c==0)
        {
          System.out.print("-1");
        }
    }
        
    }
    
}