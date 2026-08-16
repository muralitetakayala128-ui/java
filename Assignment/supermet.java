class one {
    int a=100;
    int b=200;
    void main(int x,int y){
        System.out.println("My name is ravi");
        System.out.println("x+200");
        System.out.println("y+100");
    }
}
class two extends one{
    void methode(){
        super.main(a,b);
        System.out.println("add="+(a+b));
    }
}
public class supermet {
    public static void main(String[] args) {
        two obj=new two();
        obj.methode();
        
    }
}
