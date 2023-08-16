public class vbj_11_arr {
    public static void main(String[] args) {
        float[] vbj = new float[5];
        for (int i = 0; i < 5; i++) {
            vbj[i] = Float.parseFloat(args[i]);
        }
        System.out.println(vbj.length);
    }
}