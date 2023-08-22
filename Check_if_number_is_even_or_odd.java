import java.util.Scanner;
public class Sv
{
    public static void main(String[] bhaskar)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       String k=n%2==0?"Even":"Odd";
       System.out.print(k);
    }
}