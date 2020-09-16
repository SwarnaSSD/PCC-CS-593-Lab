import java.io.*;
public class Cmd_Input
{
    public static void main(String args[])
    {
        Console in=System.console();
        System.out.println("Enter 2 decimals :");
        double a = Double.parseDouble(in.readLine());
        double b = Double.parseDouble(in.readLine());
        double s = a + b;
        double p = a * b;
        System.out.println("Sum = " + s + "\nProduct = " + p);
    }
}