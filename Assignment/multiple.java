interface father{
    String Name = "My father name is srinu naik";
    public void method();
}
interface mother{
    String Name ="My mother is varalaxmi bai";
    public void mom();
}
class child implements father,mother{
    public void method(){
        System.out.println("String Name="+("My father name is srinu naik"));
    }
    public void mom(){
            System.out.println("String Name="+("My mother is varalaxmi bai"));
    }
    public void mahesh(){
        int a=100;
        int b=100;
        System.out.println("add two numbers="+(a+b));
    }

}
public class multiple {
    public static void main(String[] args) {
        child obj=new child();
        obj.method();
        obj.mom();
        obj.mahesh();
    }
}
