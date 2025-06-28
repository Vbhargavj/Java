// package collegePracticals.class;

class circle {
    int r;

    circle(int r) {
        this.r = r;
    }

    circle() {
        r = 0;
    }

    public void area() {
        System.out.println(3.14 * r * r);
    }
}

public class vbj_24 {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.printf("The area of the circle is :");
        c.area();
    }
}