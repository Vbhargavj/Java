package LEARN;

class bhagav extends Thread {
    public void run() {

        while (true) {
            System.out.println("i am bhargav Running");

        }

    }
}

class jeet extends Thread {
    public void run() {

        while (true) {

            System.out.println("I am jeet running");
        }
    }
}

public class vbj_23_threading_using {
    public static void main(String[] args) {
        System.out.println("I am start");
        bhagav b = new bhagav();
        jeet j = new jeet();
        j.start();
        b.start();
    }
}
