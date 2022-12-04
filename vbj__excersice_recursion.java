import java.util.Scanner;

public class vbj__excersice_recursion {
    static int fibo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + fibo(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the number that find the fibonacci number"));
        int n = sc.nextInt();

        System.out.println("The value at number is " + fibo(n));

        sc.close();
    }
}
