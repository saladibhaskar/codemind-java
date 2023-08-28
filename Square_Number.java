import java.util.*;
public class sb{
    public static void main(String[] adf)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i*i+j*j==n)
                {
                    c++;
                    break;
                }
            }
        }
        if(c!=0)
        {
            System.out.print("True");
            
        }else{
            System.out.print("False");
        }
    }
}