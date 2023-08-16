package LEARN;
import java.util.Scanner;

public class vbj_06_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your name");
        String s = sc.nextLine();
        System.out.println("Hello " + s + " this is welcome massege by bhargav");
        String t = "Hello this is bhargav bhai phone";
        System.out.println(t.replace("bhargav", s));
        sc.close();
    }
}
