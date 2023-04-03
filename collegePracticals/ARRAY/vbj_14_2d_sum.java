import java.util.Scanner;

public class vbj_14_2d_sum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        // Scanner s = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the size of row and column");
        i = sc.nextInt();
        System.out.println("Enter the size of row and column");
        j = sc.nextInt();

        int[][] arr = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                arr[k][l] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int[] ks : arr) {
            for (int ks2 : ks) {
                sum = sum + ks2;
            }
        }
        System.out.println("The sum is " + sum);
        sc.close();
    }
}
