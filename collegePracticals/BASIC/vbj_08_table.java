package collegePracticals.BASIC;

import java.lang.Math;
// import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class vbj_08_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hte number to print TABLE:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }
        sc.close();
    }
}
