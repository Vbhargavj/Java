package LEARN;

class vbj implements Runnable {
    public void run() {
        while (true) {
            System.out.println("i am thread of vbj usin runnable interface");
        }
    }
}

class vjj implements Runnable {
    public void run() {
        while (true) {
            System.out.println("i am thread of vjj usin runnable interface");
        }
    }
}

class vnj extends Thread {
    public void run() {
        while (true) {
            System.out.println("i am thread of vnj using thread");
        }
    }
}

public class vbj_24_thread_using_runnable {
    public static void main(String[] args) {
        System.out.println("Threading using runnable interface");
        vbj v = new vbj();
        vjj j = new vjj();
        Thread b = new Thread(v);
        Thread k = new Thread(j);
        vnj n = new vnj();
        n.start();
        b.start();
        k.start();
    }
}