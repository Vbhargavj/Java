package LEARN;
import java.util.Scanner;

public class vbj_08_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for int variable as same as string and char
        // System.out.println("Enter your class there i am give number of subjact in
        // your class");
        // int lass=sc.nextInt();

        // switch (lass) {
        // case 9:
        // System.out.println("you have 7 subjact");
        // break;
        // case 10:
        // System.out.println("You have 7 subjact with board");
        // break;
        // case 11:
        // System.out.println("is you book");
        // break;
        // case 12:
        // System.out.println("You have more than 5 subjact");
        // break;
        // default:
        // System.out.println("i don't know ");
        // break;
        // }
        // char c='k';
        // switch (c) {
        // case 'b':
        // System.out.println("your name's first character");
        // break;
        // case 'v':
        // System.out.println("your surname's first character");
        // break;
        // case 'j':
        // System.out.println("your father's name first character");
        // break;
        // case 'k':
        // System.out.println("your fu. w. first character");
        // break;
        // default:
        // System.out.println("wtf");
        // break;
        // }
        String s = sc.next();
        switch (s) {
            case "bhargav":
                System.out.println("your name is bhargav");
                // break;
            case "jentibhai":
                System.out.println("your father name is jentibhai");
                // break;
            case "vadukar":
                System.out.println("your surname is vadukar");
                break;
            case "jeet":
                System.out.println("your fu. w. first character");
                break;
            default:
                System.out.println("i know you");
                break;
        }
        sc.close();
    }
}
