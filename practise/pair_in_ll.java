import java.util.LinkedList;


public class pair_in_ll {
    // static LinkedList<Integer> ll={1,2,1};
    // static LinkedList<Integer> ll = new LinkedList<>();
    static LinkedList<Integer> asi = new LinkedList<>();

    public static void main(String[] args) {

        int ll[] = { 1, 2, 1 };
        asi.add(1);
        asi.add(2);
        asi.add(1);

        int j = 0;
        for (int i = 0; i < ll.length; i++) {
            if (i != j && 1 == ll[i]) {
                System.out.println(i);
            }
        }

        // for (int i = 0; i < 10; i++) {
        //     k = randomGenerator.nextInt(10) + 1;
        //     if (ll.contains(k)) {
        //         i--;
        //         ll.contains(k);
        //     } else {
        //         ll.add(k);
        //     }
        // }
        pr();
    }

    public static void pr() {
        System.out.println(asi.get(0));
        System.out.println(asi.get(1));
        System.out.println(asi.get(2));
        System.out.println(asi.size());
    }
}
