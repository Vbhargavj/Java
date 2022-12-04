import java.util.Scanner;

public class vbj_04_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total, sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter the total mark of the subject");
        total = sc.nextFloat();
        System.out.println("enter the subjact 1 mark");
        sub1 = sc.nextFloat();
        System.out.println("enter the subjact 2 mark");
        sub2 = sc.nextFloat();
        System.out.println("enter the subjact 3 mark");
        sub3 = sc.nextFloat();
        System.out.println("enter the subjact 4 mark");
        sub4 = sc.nextFloat();
        System.out.println("enter the subjact 5 mark");
        sub5 = sc.nextFloat();
        total = (sub1 + sub2 + sub3 + sub4 + sub5) * 100 / (5 * total);
        System.out.println(total);
        sc.close();
    }
}