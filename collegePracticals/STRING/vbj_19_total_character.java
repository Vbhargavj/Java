public class vbj_19_total_character {
    public static void main(String[] args) {
        int total = 0;
        for (String s : args) {
            
            total += s.replaceAll("\\d", "").length();
        }
        System.out.println(total);
    }
}
