package LEARN;

// import javax.print.DocFlavor.STRING;

class thread extends Thread {
    public thread(String name) {
        super(name);
    }
    public void run() {
        while(true)
            System.out.println("MY name is "+this.getName());
    }
}

public class vbj_25_thread_priority {
    public static void main(String[] args) {
        thread t1 = new thread("bhargav");
        thread t2 = new thread("jeet");
        t1.setPriority(10);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}