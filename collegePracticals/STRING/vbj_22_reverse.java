import java.util.Scanner;

public class vbj_22_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse.and terminate the program to enter 'close'");    
        String s = sc.nextLine();
        
        while (!s.equals("close")) {
            StringBuffer t = new StringBuffer(s);
            t.reverse();
            System.out.println("The reverse string is " + t);
            System.out.println("Enter the string to reverse");
            s = sc.nextLine();
        }
        sc.close();

    }
}
