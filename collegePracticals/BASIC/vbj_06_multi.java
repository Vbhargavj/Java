package collegePracticals.BASIC;

import java.util.Scanner;

public class vbj_06_multi {
    public static void main(String[] args) {
        double d1, d2;
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        d1 = d1 * d2;
        System.out.println(d1);
        sc.close();
    }
}
