public class vbj_14_2d_sum {
    public static void main(String[] args) {        
        int[][] arr = { { 45, 6, 12 }, { 23, 67, 3 }, { 78, 54, 12 } };        
        int sum = 0;
        for (int[] ks : arr) {
            for (int ks2 : ks) {
                sum = sum + ks2;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
