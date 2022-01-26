import java.util.Scanner;

public class Wk1Q2b
{
    public static void main(String arg[])
    {
        System.out.print("Enter a module code: ");
        Scanner input = new Scanner(System.in);
        String module = input.next();
        switch(module)
        {
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Unknown Module Code");
                break;
        }
        input.close();
    }
    
}