import java.util.Scanner;
public class av{
    public static void main(String[] sb)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double k=(a+b)/2.0;
        System.out.printf("%.4f",k);
    }
}