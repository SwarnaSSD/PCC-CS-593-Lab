import java.io.*; 
public class Buffer_Input
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader s=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(s);
        System.out.println("Enter 2 decimals :");
        String s1=in.readLine();
        String s2=in.readLine();
        double a=Double.parseDouble(s1);
        double b=Double.parseDouble(s2);
        double p = a * b;
        double sum = a + b;
        System.out.println("Sum : " + sum + "\tProduct : " + p);
    }
}