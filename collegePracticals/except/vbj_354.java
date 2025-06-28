import java.util.Scanner;

public class vbj_354 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            String s = sc.nextLine();

            try {
                int a=Integer.parseInt(s);
                System.out.println("Tha integer is " + a);
            } catch (NumberFormatException e)  {
                System.out.println("Error ,Please enter integer in proper format");
            }
        }
    }
}
