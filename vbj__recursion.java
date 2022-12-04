import java.util.Scanner;

public class vbj__recursion {
    static float factorial(Float n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    static float factorial2(Float n) {
        float res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find factorial");
        float n = sc.nextFloat();
        // float k = sc.nextFloat();
        System.out.println(factorial(n));
        System.out.println(factorial2(n));
        sc.close();

        // int k=factorial(n);
    }
}
