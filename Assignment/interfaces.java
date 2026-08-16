 interface i1 {
    int a;
    int b;
    public void display();
class c implements i1 {
    public void display(){
        System.out.println("mul of two numbers="+(a*b));
    }
}
public class interfaces {
public static void main(String[] args) {
    c obj = new c();
    obj.display(); 
}   
}