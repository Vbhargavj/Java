// package LEARN;
class name1 {
    private int rollnum;
    private String name;

    void setrn(int i) {
        rollnum = i;
    }

    void setname(String n) {
        name = n;
    }

    void getdata() {
        System.out.println("The student name is " +name);
        System.out.println("The student rollnumber is " + rollnum);
    }
}

public class vbj_17_access_modifier {

    public static void main(String[] args) {
        name1 k = new name1();
        k.setrn(54);
        k.setname("bhargav");
        k.getdata();
    }
}
