import java.util.Scanner;
public class Sb{
    public static void main(String[] SV)
    {
        Scanner s=new Scanner(System.in);
        String g=s.next();
        if(g.length()!=10)
        {
            System.out.print(-1);
            return;
        }
        int cnt=0;
        for(int i=0;i<g.length();i++)
        {
            if(g.charAt(i)=='0')
            cnt+=1;
            else
            break;
        }
        char[] d=g.toCharArray();
        int[] a = new int[10];
        int[] b= new int[10];
        int i;
        for(i=0;i<d.length;i++)
        {
            a[i]=(int)(d[i]-48);
            b[a[i]]++;
        //System.out.print(a[i]+" ");
            
        }
        String k="";
        int c=0;
        for(i=0;i<10;i++)
        {
           // System.out.print(b[i]+" ");
           if(b[i]>=5)
           {
             //k="FANCY NUMBER";
             c=1;
             break;
           }
            //System.out.print(a[j]+" ");
             
        }
        for(i=0;i<8;i++)
        {
            if(a[i]==a[i+1]&&a[i]==a[i+2])
            {
            //System.out.print(a[i]+" ");
               //k="FANCY NUMBER";
               c=1;
               break;
            }
            else if(a[i]==a[i+1]-1&&a[i+1]==a[i+2]-1)
            {
                //System.out.print(a[i]+" ");
                //k="FANCY NUMBER";
                c=1;
                break;
            }
            else if(a[i]==a[i+1]+1&&a[i+1]==a[i+2]+1)
            {
                //k="FANCY NUMBER";
                c=1;
                break;
            }
            
        }
         if(c==0)
        {
            System.out.print("NOT A FANCY NUMBER");
        }else{
        System.out.print("FANCY NUMBER");}
    }
}