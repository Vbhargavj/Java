public class vbj_16_replace {
    public static void main(String[] args) {
        String s = new String("java123is234fun");
        s = s.replaceAll("\\d", " ");
        s = s.replaceAll("   ", " ");
        String[] s2 = s.split(" ");        
        for (String t : s2) {
            System.out.println(t);
        }
    }
}
