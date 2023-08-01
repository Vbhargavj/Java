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

    public void sow() {
        System.out.println("Circle of "+r+" is located at ("+x+","+y+") coordinates");
    }
}
public class vbj_27_circle {
    public static void main(String[] args) {
        circle c1 = new circle(5);
        circle c2 = new circle(12,-1.5,1.5);
        c1.sow();
        c2.sow();
    }
}
