class one{
    int a=100;
    int b=100;
    String Name="gopi";
    int rollNo=206;
    void methode(){
        System.out.println("add="+(a+b));
        System.out.println("name is ="+(Name));
        System.out.println("rollno is ="+(rollNo));
    }
}


class two extends one{
    void method(){
        int a=234;
        int b=234;
        super.methode();
        System.out.println("multiplication="+(a*b));
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        two t=new two();
        t.method();
    }
}
