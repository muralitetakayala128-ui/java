class murali{
    int a=240;
    void fox(){
        System.out.println("me and my room mates are good boys");
    }
}
class sharath extends murali{
    void method(){;
        int b=10;
        System.out.println("mulplication of two numbers="+(a*b));
    }

}
class ganesh extends murali{

       
}
public class heirarical {
    public static void main(String[] args) {
        sharath obj=new sharath();
        ganesh G=new ganesh();
        obj.method();
        obj.fox();
        G.fox();
    }
}
