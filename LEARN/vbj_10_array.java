package LEARN;
public class vbj_10_array {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 13;
        array[2] = 12;
        array[3] = 14;
        array[4] = 431;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int val : array) {
            System.out.println(val);
        }
    }
}