import java.util.*;
public class sb{
    public static void main(String[]xsd)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==n)
                {
                    System.out.print("*");
                }
                else
                {
                    if(j==1||j==i){
                System.out.print("*");}
                 else{
                    System.out.print(" ");
                }
                }
            }
            System.out.println();
        }
    }
}