class circle1 {
    double r;

    circle1() {
        r = 1;
    }

    circle1(double r) {
        this.r = r;
    }
    
    public double area() {
        return 2 * 3.14 * r * r;
    }
}

class cylinder extends circle1 {
    double h;
    cylinder() {
        h = 1;
    }

    cylinder(double h) {
        this.h = h;
    }
    cylinder(double r,double h) {
        super(r);
        this.h = h;
    }


    public double area() {
        return 2 * 3.14 * h * r;
    }
}

public class vbj_29_cylinder {
    public static void main(String[] args) {
        cylinder c = new cylinder(5.4, 13);
        System.out.println("The area of the cylinder is "+ c.area());
    }
}