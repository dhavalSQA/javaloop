import java.util.Scanner;

public class NumberRange
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter starting number of range :");
        int n1=scanner.nextInt();
        System.out.println("Enter ending number of range : ");
        int n2=scanner.nextInt();

        for(int i=n1;i<=n2;i++)
        {
            System.out.println(i);
        }
    }
}
