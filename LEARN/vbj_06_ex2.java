package LEARN;
import java.util.Scanner;
public class vbj_06_ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string with space in repl ace with '_'");
        String s=sc.nextLine();

        System.out.println(s.replace(" ", "_"));
        sc.close();
    }
}
