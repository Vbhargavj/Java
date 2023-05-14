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

    public void show() {
        System.out.println("Radious  of " + r + " Sphere is located at (" + x + "," + y + ") coordinates");
    }
}
public class vbj_28_sphere2 {
    public static void main(String[] args) {
        sphere s = new sphere();
    }
}
