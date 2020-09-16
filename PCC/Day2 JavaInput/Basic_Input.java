import java.io.*; 
public class Basic_Input 
{
 public static void main(String[] args) throws IOException
    {
        char ch;
        String str = "";
        System.out.println("Enter a decimal value {press * to quit} :");
        while((ch = (char)System.in.read())!='*')
            str = str + ch;
        double n=Double.parseDouble(str);
        System.out.println("Number is " + n);
    }
}