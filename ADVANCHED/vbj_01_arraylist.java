package ADVANCHED;

import java.util.ArrayList;

public class vbj_01_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int i = 1;
        l.add(i++ * i++);
        l.add(i++ * i++);
        l.add(i++ * i++);
        System.out.println(l.get(0));
        System.out.println(l.size());
        System.out.println(l.contains(1));
        System.out.println(l.remove(2));
        // System.out.println(l.sort(null));
    }

}
