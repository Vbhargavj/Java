class complex {
    int a, b;

    complex() {
        a = 0;
        b = 0;
    }
    complex(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void add(complex c1, complex c2) {
        a = c1.a + c2.a;
        b = c1.b + c2.b;
    }
    public void compare(complex c) {
        if (a == c.a && b == c.b) {
            System.out.println("Both Same");
        } else {
            System.out.println("Both Different");
        }
    }
}

public class vbj_25_complex {
    public static void main(String[] args) {
        complex c1 = new complex(3, 4);
        complex c2 = new complex(5, 6);
        c2.compare(c1);
        complex c3 = new complex();
        c3.add(c1, c2);
        System.out.println("After addition the complex number is :"+c3.a+" + "+c3.b+"i");      
    }
}
