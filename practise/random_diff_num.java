import java.util.LinkedList;
import java.util.Random;

public class random_diff_num {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        System.out.println("============================");
        System.out.println("Generating 10 random integer in range of 1 to 10 using Random");
        System.out.println("============================");
        Random randomGenerator = new Random();
        int k;
        for (int i = 0; i < 10; i++) {
            k = randomGenerator.nextInt(10) + 1;
            if (ll.contains(k)) {
                i--;
            } else {
                ll.add(k);
            }
        }
        for (Integer integer : ll) {
            System.out.println(integer);
        }
    }
}