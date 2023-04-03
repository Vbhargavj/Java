package collegePracticals.BASIC;

import java.util.Scanner;

public class vbj_02_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " Is even");
        }
    sc.close();

    }
}
