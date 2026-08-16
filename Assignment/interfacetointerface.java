interface I1 {
    void add(int a, int b);
}

interface I2 extends I1 {
    void multiplication(int a, float b);
}

class C implements I2 {

    public void add(int a, int b) {
        System.out.println("Add = " + (a + b));
    }

    public void multiplication(int a, float b) {
        System.out.println("Multiplication = " + (a * b));
    }
}

public class interfacetointerface {

    public static void main(String[] args) {
        C obj = new C();

        obj.add(10, 20);
        obj.multiplication(10, 20.5f);
    }
}
