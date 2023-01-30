package LEARN;
abstract class base {

    public void name() {
        System.out.println("My name is base");
    }

    abstract public void greet();
}

class child extends base {

    public void use() {
        System.out.println("I am useless now");
    }

    public void say() {
        System.out.println("I am testing by bhargav");
    }

    public void greet() {
        System.out.println("My name is child");
    }
}

public class vbj_20_abstract_class {
    public static void main(String[] args) {
        child c = new child();
        c.greet();
        c.use();
    }
}