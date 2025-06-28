import java.util.Scanner;

class invalidException extends Exception {
    public invalidException(String s) {
        super(s);
    }
}

public class vbj_24_except {

    public static void main(String[] args) {
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter you age");

                age = sc.nextInt();

                if (age < 0) {
                    throw new invalidException("Invalid age");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    
}