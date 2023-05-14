public class vbj_02_odd_even {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0) {
            System.out.println(num + " Is even");
            
        } else {
            System.out.println(num + " is odd");
        }
    }
}
