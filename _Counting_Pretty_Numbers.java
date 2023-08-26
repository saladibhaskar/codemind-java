import java.util.*;
public class Sb{
    public static void main(String[] as)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int k=1;k<=t;k++)
        {
            int cn=0;
            int a=s.nextInt();
            int b=s.nextInt();
            int r=0;
            for(int i=a;i<=b;i++)
            {
                 r=i%10;
                if(r==3||r==2||r==9)
                {
                    cn++;
                }
            }
            System.out.println(cn);
        }
    }
}