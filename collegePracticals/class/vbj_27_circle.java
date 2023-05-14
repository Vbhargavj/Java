class circle {
    double r, x, y;

    circle(double r) {
        this.r = r;
        x = y = 0;
    }

    circle(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("Circle of "+r+" is located at ("+x+","+y+") coordinates");
    }
}
public class vbj_27_circle {
    public static void main(String[] args) {
        circle c = new circle(5);
        c.show();
    }
}
