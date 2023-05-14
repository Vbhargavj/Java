// package collegePracticals.BASIC;

import java.util.Scanner;

public class vbj_07_area {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        n = sc.nextDouble();
        System.out.println("Enter the feet or meter for the value");
        Scanner c = new Scanner(System.in);
        String s = c.nextLine();
        if (s.equals("feet")) {
            System.out.println(n / 3.28 + " meter");
        }
        else if (s.equals("meter")) {
            System.out.println(n * 3.28 + " Feet");
        }
        else {
            System.out.println("Enter proper value");
        }
        sc.close();
        c.close();
    }
}
