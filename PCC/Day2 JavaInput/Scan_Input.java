import java.util.*;
class Scan_Input
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Name and age : ");
        String str = inp.nextLine();
        int age = sc.nextInt();
        System.out.println("Name = " + str);
        System.out.println("Age = " + age);
    }
}