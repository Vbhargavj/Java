package LEARN;

interface camera {

    void micro();

    void takeshot();
}

class cellPhone implements camera {
    public void micro() {
        System.out.println("I am use micro lens for better result");
    }

    public void takeshot() {
        System.out.println("I am click simple shot on the camera");
    }
}

public class vbj_22_interfaces {
    public static void main(String[] args) {
        cellPhone c = new cellPhone();
        c.micro();
        c.takeshot();
        // c.close();
    }
}
