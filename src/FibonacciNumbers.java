import java.util.Scanner;

public class FibonacciNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fibonacci number : ");
        int n1 = scanner.nextInt();
        for (int i = 0; i < n1; i++)
        {
            System.out.print(i);
        }
    }
}