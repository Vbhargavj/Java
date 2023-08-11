package collegePracticals.BASIC;


// package collegePracticals.BASIC;

import java.lang.Math;

public class vbj_09_sum {
    public static void main(String[] args) {
        double sum = 0;
        while (sum < 20) {
            sum = sum + Math.random();
        }
        System.out.println("The sum is "+sum + " Therefore break the loop");
    }
}
