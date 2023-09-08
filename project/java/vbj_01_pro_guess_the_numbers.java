package java;

import java.util.Random;
import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

class game {
    Random raom = new Random();
    int nattemp = 0;
    int uchoise;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        nattemp++;
        uchoise = sc.nextInt();
        sc.close();
    }

    int choise = raom.nextInt(100);

    public boolean correct() {
        if (choise == uchoise) {
            return true;
        } else if (choise < uchoise) {
            System.out.println("To greater *** ***");

        } else {
            System.out.println("To less  *** ***");
        }
        return false;
    }

    public int getChoise() {
        return choise;
    }

}

public class vbj_01_pro_guess_the_numbers {
    public static void main(String[] args) {
        game g = new game();
        // System.out.println(g.getChoise());
        do {
            g.scan();
        } while (!g.correct());
        System.out.printf("you choose corect answer in  %d attemp", g.nattemp);
    }

}
