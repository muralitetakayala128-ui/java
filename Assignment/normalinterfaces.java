
interface u1{
    int a=100;
    int b=100;
    void display(String Name,int rollNo);
    void add();
}

class mahesh implements u1{
    String name;
    int rollNo;
    public void display(String name,int rollNo){
        System.out.println("name is="+name );
        System.out.println("roll no is ="+rollNo);
    }
    public void add(){
        System.out.println("add="+(a+b));
    }     
}

public class normalinterfaces {
    public static void main(String[] args) {
        mahesh prabhas=new mahesh();
        prabhas.display("gopi",206);
        prabhas.add();
    }
}
