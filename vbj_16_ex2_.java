import java.util.Random;
import java.util.Scanner;

public class vbj_16_ex2_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choise");
        int win = 0, comp_choise, user_choise;
        Random random = new Random();

        for (int i = 0; i <= 5; i++) {
            user_choise = sc.nextInt();
            user_choise--;
            comp_choise = random.nextInt(3);
            System.out.println("Your choise is : " + user_choise + " and Computer choise is : " + comp_choise + "\nhence");

            if (comp_choise < user_choise) {
                System.out.println("Computer win");
                win--;
            } else if (comp_choise > user_choise) {
                System.out.println("You win");
                win++;
            } else {
                System.out.println("Draw");
            }
            // System.out.println(comp_choise);
        }
        if (win > 0) {
            System.out.println("Finally You win");

        } else if (win < 0) {
            System.out.println("Finally Computer win");

        } else {
            System.out.println("Finally Draw");
        }
        sc.close();
    }

}
