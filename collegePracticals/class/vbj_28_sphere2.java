class sphere {
    double r, x, y;

    sphere() {
        r = 1;
        x = y = 0;
    }

    sphere(double r) {
        this.r = r;
        x = y = 0;
    }

    sphere(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Radious  of " + r + " Sphere is located at (" + x + "," + y + ") coordinates");
    }
}
public class vbj_28_sphere2 {
    public static void main(String[] args) {
        sphere s1 = new sphere();
        sphere s2 = new sphere(6);
        sphere s3 = new sphere(3, 4, 8);
        
        s1.display();
        s2.display();
        s3.display();

    }
}
