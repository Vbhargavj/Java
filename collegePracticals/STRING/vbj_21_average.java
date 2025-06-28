public class vbj_21_average {
    static double average(String[] vbj) {
        int sum = 0;
        for (String s : vbj) {
            sum += Double.parseDouble(s);
        }
        return (double)sum / vbj.length;
    }
    public static void main(String[] args) {
        String [] s = { "2.3", "4.5", "5.6" };
        System.out.println(average(s));
    }
}
