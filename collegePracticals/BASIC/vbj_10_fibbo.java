package collegePracticals.BASIC;

// package collegePracticals.BASIC;

public class vbj_10_fibbo {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.println("Fibonaci series....");
        System.out.print(a + " " + b);
        for (int i = 0; i < 10; i++) {
            c= a + b;
            System.out.print(" "+c);
            a = b;
            b = c;            
        }
    }
}
