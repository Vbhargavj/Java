
import java.util.Scanner;

class vbj {
    public static void main(String[] args) {

        int a, b;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            a = sc.nextInt();
            System.out.println("enter the second number");
            b = sc.nextInt();
        }
        try {
            if (b == 0) {
                throw new ArithmeticException("Invalid,Any number is not devide by 0");
            }
            a = a / b;
            System.out.println("Result: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    

}