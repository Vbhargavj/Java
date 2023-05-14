public class vbj_20_upper {
    public static void main(String[] args) {
        String[] str = { "bhargav", "krur", "sdfwdf", "asd", "vbj" };
        for (String s : str) {
            if (s.equals(args[0]) && 97 <= (int) s.charAt(0) && (int) s.charAt(0) <= 122) {

                System.out.println("ERROR");
            }
        }
    }
}
