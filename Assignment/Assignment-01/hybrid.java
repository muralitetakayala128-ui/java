class C1{
    int a=100;
    int b=200;
    float x=25.7f;
    float y=45.5f;
    void classic(){
        System.out.println("classic="+(x+y));
        System.out.println("Mahesh is a star");
    }
}
class C2 extends C1{
    //over loading
    void classic(int p,int q){
        System.out.println("sub="+(p-q));
    }
}
class C3 extends C1{
    void classic(){
        System.out.println("My name is gopi");
    }
}
class C4 extends C2{
    void classic(){
        System.out.println("equal or not="+(a=b));
        System.out.println("a+b");
    }
}
class C4 extends C3{
    void classic (){
        System.out.println("who are you");
    }
}

public class hybrid {
    public static void main(String[] args) {
        C4 obj=new C4();
        obj.classic();
        obj.classic(20,10);
    }
    
}
