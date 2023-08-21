import java.util.Scanner;
public class sb{
    public static void main(String [] ars)
    {
    Scanner sc=new Scanner(System.in);
    int s,k;
    s=sc.nextInt();
    for(k=1;k<=s;k++)
    {
        int n,i,t,c=0,j;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                    c++;
                    
                }
            }
        }
        if(c==0)
        {
            System.out.println("0");
        }
        else
        {
            int d;
            d=a[n-1]-a[0];
            System.out.println(d);
        }
        
    }
}
    }