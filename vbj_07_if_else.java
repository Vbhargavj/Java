import java.util.Scanner;

public class vbj_07_if_else {
    public static void main(String[] args) {

        boolean c = 12 < 34;
        if (c) {
            System.out.println("You \n\tare \n\t\tmy \n\t\t\tbestfriend");
        } else {
            System.out.println("You are my dushman");
        }
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        if (age > 18) {
            System.out.println("Now you are eligible for DL");

        } else {
            System.out.println("you are not eligible for DL");
        }
        sc.close();
    }
}
