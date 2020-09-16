import java.io.Console;
public class Console_Input
{
    public static void main(String args[])
    {
        Console in=System.console();
        System.out.println("Enter two decimal values:");
        double a = Double.parseDouble(in.readLine());
        double b = Double.parseDouble(in.readLine());
        double s = a + b;
        double p = a * b;
        System.out.println("Sum = " + s + "\nProduct = " + p);
    }
}