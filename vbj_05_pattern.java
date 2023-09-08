// package collegePracticals.BASIC;

import java.util.Scanner;

public class vbj_05_pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pattern");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.printf("A ");
            System.out.println();
        }
        sc.close();
    }
}
