
public class vbj_12_byte {
    public static void main(String[] args) {
        byte[] b = { 3, 12, 45, 23 };
        float sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum = sum + b[i];
        }
        sum = (float) sum / 4;
        System.out.println("The average of the array is : "+sum);
    }
}
