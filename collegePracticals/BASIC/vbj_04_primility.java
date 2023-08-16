package collegePracticals.BASIC;

// package collegePracticals.BASIC;

import java.util.Scanner;

public class vbj_04_primility {
    public static void main(String[] args) {
        int n,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prilimity");
        n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0 ) {
                f=1;
                break;
            }
            f = 0;
        }
        if (f == 0) {
            System.out.println(n + " is prilimiry Number");
        }
        else {
            System.out.println(n + " Is not prilimiry number");
        }
        sc.close();
    }
}
