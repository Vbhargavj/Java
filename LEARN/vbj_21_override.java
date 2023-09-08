package LEARN;
class test {

    public void name() {
        System.out.println("I am name of class test");
    }
}

class beta extends test {
    @Override
    public void name() {
        System.out.println("I am name of class of beta ");
    }
}

public class vbj_21_override {
    public static void main(String[] args) {
        beta b = new beta();
        b.name();
    }
}
