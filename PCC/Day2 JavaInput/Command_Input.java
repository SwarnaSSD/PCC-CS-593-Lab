public class Command_Input 
{
 public static void main(String[] args)
    {
     System.out.println("Enter two decimal values:");
     double a=Double.parseDouble(args[0]);
     double b=Double.parseDouble(args[1]);
     double s = a + b;
     System.out.println("First: " + a);
     System.out.println("Second: " + b);
     System.out.println("Sum: " + s);
    }
}