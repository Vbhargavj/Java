
public class vbj_12_byte {
    public static void main(String[] args) {
        byte[] b = new byte[4];
        for (int i = 0; i <= 3; i++) {
            b[i] = Byte.parseByte(args[i]);
        }
        float sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum = sum + b[i];
        }
        sum = (float) sum / 4;
        System.out.println(sum);
    }
}
