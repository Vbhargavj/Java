
package collegePracticals.BASIC;

import java.lang.Math;

public class vbj_09_sum {
    public static void main(String[] args) {
        double sum = 0;
        while (sum < 20) {
            System.out.println(sum);

            sum = sum + Math.random();
        }
        System.out.println(sum);
        // random.nextInt(0);
    }
}
