package LEARN;
import java.util.Scanner;

public class vbj_11_ex_multitable {

    public static void multi(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nyuber to print table");
        int n = sc.nextInt();
        multi(n);
        sc.close();
    }
}
