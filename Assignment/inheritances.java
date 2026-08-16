class one{
    void add(int a,int  b){
        System.out.println("add= "+(a+b));
    }
}
class two extends one{
   int x=100;
   int y=200;
    void display(){
        System.out.println("sum of two numbers="+(x+y));
    }
}
public class inheritances {

    

public static void main(String args[]){
    two obj=new two();
    obj.add(10,20);
    obj.display();
    System.out.println(obj.y);
}
}