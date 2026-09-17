

interface I1 {
    int x = 4;
    void sample();
}

interface I2 extends I1 {
    int y = 11;
    void demo();
}

class many implements I1, I2 {

    public void sample() {
        System.out.println("this is from I1");
    }

    public void demo() {
        System.out.println("this is from I2");
    }

    void mymethod() {
        System.out.println("from child class");
    }
}

public class First {
    public static void main(String[] args) {

        many mlt = new many();

        System.out.println(I1.x);
        System.out.println(I2.y);

        mlt.demo();
        mlt.sample();
        mlt.mymethod();
    }
}
    
   





