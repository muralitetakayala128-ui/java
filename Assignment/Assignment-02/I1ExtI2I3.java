
    interface I2 {
    int n = 15;

    void display();
}

interface I3 {
    int m = 25;

    void example();
}

interface I1 extends I2, I3 {
    int p = 20;

    void sample();
}

class C1 implements I1 {

    @Override
    public void display() {
        System.out.println("This is from interface I2");
        System.out.println("Value of n is : " + n);
    }

    @Override
    public void example() {
        System.out.println("This is from interface I3");
        System.out.println("Value of m is : " + m);
    }

    @Override
    public void sample() {
        System.out.println("This is from interface I1");
        System.out.println("Sum of n, m and p is : " + (n + m + p));
    }
}
public class I1ExtI2I3 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.display();
        obj.example();
        obj.sample();
    }
}

