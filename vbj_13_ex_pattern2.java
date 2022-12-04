public class vbj_13_ex_pattern2 {

    static void pattern2(int n) {
        if (n > 0) {
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            pattern2(n - 1);
        }
    }

    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (j <= 6 - i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        pattern2(120);
    }
}