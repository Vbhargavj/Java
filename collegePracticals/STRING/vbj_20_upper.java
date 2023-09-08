public class vbj_20_upper {
    public static void main(String[] args) {
        String[] str = { "Bhargav", "krur", "sdfwdf", "asd", "vbj" };
        int f = 1;
        for (String s : str) {
            if (s.equals(args[0]) && 97 <= (int) s.charAt(0) && (int) s.charAt(0) <= 122) {

                System.out.println("ERROR");
                f = 0;
                break;
            }

        }
        if (f==1) {
            System.out.println("No Error");
        }
    }
}
