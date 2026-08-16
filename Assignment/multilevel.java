class inheritance {
    public void name() {
        String moviename="magadheera";
        String heroname="ramcharan";
        int  budget=200;
        System.out.println("moviename is ="+moviename);
        System.out.println("hero name is="+ heroname);
        System.out.println("budget is ="+ "budget");
        
    }
}
class gopi extends inheritance{
    public void main(int a,int b){
        System.out.println("add="+(a+b));
        System.out.println("divide="+(a/b));
    }
}
class ramcharan extends gopi{
    int a=100;
    int b=100;
    public void method(){
        System.out.println("add="+(a+b));
    }
    
}

public class multilevel {
    public static void main(String[] args) {
        ramcharan obj=new ramcharan();
        obj.method();
        obj.main(100,100);
        obj.name();

    }
}
