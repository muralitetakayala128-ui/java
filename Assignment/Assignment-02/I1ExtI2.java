interface I2 {
    int m = 30;

    void display();
}

interface I1 extends I2 {
    int t = 65;

    void example();
}

class C1 implements I1 {

    @Override
    public void display() {
        System.out.println("This is from interface I2");
        System.out.println("Value of m is : " + m);
    }

    @Override
    public void example() {
        System.out.println("This is from interface I1");
        System.out.println("Sum of m and t is : " + (m+ t));
    }
}
public class I1ExtI2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.display();
        obj.example();
    }
}
