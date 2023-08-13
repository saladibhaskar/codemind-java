import java.util.Scanner;
public class max
{
    public static void main(String[] ars)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n*(n-1)/2;
        System.out.print(m);
    }
}