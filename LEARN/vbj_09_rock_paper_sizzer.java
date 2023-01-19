// package LEARN;
import java.util.Random;
import java.util.Scanner;

public class vbj_09_rock_paper_sizzer {
    public static void main(String[] args) {

        // here this is a intisilize section random for random choise of computer
        Random r = new Random();
        // this scaner objact scan input from user
        Scanner sc = new Scanner(System.in);
        // cc for computer choise // uc for user choise
        int cc, uc, w = 0;
        // this loop continue 5 times
        for (int i = 0; i < 5; i++) {
            cc = r.nextInt(2);
            System.out.println("Enter the number\n\t '1' for rock\n\t '2' for paper\n\t '3' for sizers");
            uc = sc.nextInt();
            uc = uc - 1;

            System.out.println("Computer turn");
            // this switch case is display the computer choise
            switch (cc) {
                case 0:
                    System.out.println("rock\n");
                    break;
                case 1:
                    System.out.println("paper\n");
                    break;
                case 2:
                    System.out.println("sizoers\n");
                    break;
                default:
                    break;
            }

            System.out.println("Your turn is");

            // this switch case is display the user choise
            switch (uc) {
                case 0:
                    System.out.println("rock\n");
                    break;
                case 1:
                    System.out.println("paper\n");
                    break;
                case 2:
                    System.out.println("sizoers\n");
                    break;
                default:
                    break;
            }

            System.out.println("Hence");
            // this will decide who is winner
            if (uc <= 2 && uc >= 0) {
                if (uc == cc) {
                    System.out.println("Draw\n");
                } else if (uc > cc) {
                    System.out.println("You win\n");
                    w++;
                } else if (uc < cc) {
                    System.out.println("You loose\n");
                    w--;
                }
            }
            // when user don't enter valid choise counter is decrease
            else {
                System.out.println("Enter valid choise");
                i--;
            }

        }

        // this show final results
        System.out.println("FINAL RESULT");
        if (w > 0) {
            System.out.println("You are winner");
        } else if (w < 0) {
            System.out.println("You loose");
        } else {
            System.out.println("Draw");
        }
        sc.close();
    }
}