public class vbj_23_sringbuf {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("bhargav");
        System.out.println("The string buffer is "+buffer);
        buffer.append("bhai");
        System.out.println("After append bhai in string buffer is "+buffer);
        buffer.reverse();
        System.out.println("After reverse The string buffer is "+buffer);
    }
}