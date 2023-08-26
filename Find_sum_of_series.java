import java.util.Scanner;
public class add{
    public static void main(String[] ar){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    double sum=0,a;
    for(int i=1;i<=n;i++)
    {
        a=(double)1/i;
        sum=sum+a;
    }
    System.out.printf("%.2f",sum);
    }
}