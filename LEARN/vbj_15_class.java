// package LEARN;
class greeting {
    int salary;
    String s;

    public void fi() {
        System.out.println("Helllo this is my first class");
    }

    public void getData() {
        System.out.println("tusi " + salary);
        System.out.println("some massage+++++++++ " + s);
    }
}

public class vbj_15_class {
    public static void main(String[] args) {
        System.out.println("Welcome to most popular language ");
        greeting g = new greeting();
        g.salary = 10;
        g.s = "this is bhargav";
        g.fi();
        g.getData();
    }
}
