import java.util.Scanner;
public class SD{
    public static void main(String [] sf)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=-1,b=1,c=0,cn=0;
        while(cn<n)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            cn++;
        }
        
    }
}