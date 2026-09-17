
    interface I1 {
    int n = 40;

    void display();
}

class Co implements I1 {

    @Override
    public void display() {
        System.out.println("This is from interface I1");
        System.out.println("Square of n is : " + (n * n));
    }
}

public class C1ImplI1 {
    public static void main(String[] args) {
        
        Co obj=new Co();
        obj.display();
    }
}


