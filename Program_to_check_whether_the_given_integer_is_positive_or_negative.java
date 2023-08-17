import java.util.Scanner;
public class Sb
{
    public static void main(String [] sdn)
    {
        Scanner s=new Scanner(System .in);
        int n=s.nextInt();
        if(n<0)
        {
            System.out.print("Negative Number");
        }else{
            System.out.print("Positive Number");
        }
    }
}