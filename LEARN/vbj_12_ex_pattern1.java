package LEARN;
public class vbj_12_ex_pattern1 {

    static void PatternRecursion(int n) {
        if (n > 0) {
            PatternRecursion(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // // System.out.println(*i);
        // if (j <= i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        PatternRecursion(5);
    }
}
