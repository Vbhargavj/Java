

public class vbj_15_string {
    public static void main(String[] args) {
        String s1 = new String("bhargav");
        String s2 = new String("bhagav");

        if (s1.equals(s2)) {
            System.out.println("True");
        } else {
            s1 = s1.concat(s2);
            System.out.println(s1);
        }
    }
}
