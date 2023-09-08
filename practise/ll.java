import java.util.LinkedList;

public class ll {
    static LinkedList<Integer> l;

    public static void print() {
        System.out.println(l.get(0));
    }
    public static void main(String[] args) {
        l = new LinkedList<Integer>();
        l.add(12);
        print();
    }

   
}
