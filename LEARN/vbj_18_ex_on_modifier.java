package LEARN;
class surface {
    private int radius, height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    // using constructor 
    public surface(int rad, int heg) {
        this.height = heg;
        this.radius = rad;
    }
    
}

public class vbj_18_ex_on_modifier {
    public static void main(String[] args) {
        // surface s = new surface();
        // s.setHeight(34);
        // s.setRadius(12);
        // System.out.println( s.getRadius());
        // System.out.println( 2*3.14*s.getHeight());
        surface s = new surface(2, 1);
        System.out.println( s.getRadius());        
    }
}
