class sphere {
    double r;
    double x, y;

    sphere() {
        r = x = y = 0;
    }
    sphere(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("The radius of the sphere is "+r+" and sphere locatade on ("+x+","+y+") co-ordinates");
    }

}
public class vbj_26_Sphere {
    public static void main(String[] args) {
        sphere s1 = new sphere();
        sphere s2 = new sphere(1, 4, -4);
        s1.show();
        s2.show();
    }
}
