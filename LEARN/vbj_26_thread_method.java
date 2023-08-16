package LEARN;

class power extends Thread {
    public power(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am power " + this.getName());
            i++;
        }
    }
}

public class vbj_26_thread_method {
    public static void main(String[] args) {
        System.out.println("Starting");
        power p = new power("me");
        power m = new power("java");
        p.start();
        try {
            p.join();
        } catch (Exception e) {
            System.out.println("Failed to join");
        }
        m.start();
    }
}
