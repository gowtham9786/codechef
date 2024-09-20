import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        do {
            factorial *= num;
            num--;
        } while (num > 0);

        System.out.println(factorial);
    }
}
