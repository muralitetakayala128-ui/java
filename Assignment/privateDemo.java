class student{
    private int marks=100;
    void display(){
        System.out.println(marks);
    }
}

public class privateDemo {
    public static void main(String[] args) {
        student S=new student();
        S.display();
    }
}
