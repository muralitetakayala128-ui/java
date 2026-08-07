package sample.java;

public class ConDemo {
	int rollno;
	String name;
	float marks;
	
	public ConDemo() {
		System.out.println("Hello");
		this.rollno = 30;
		this.name = "Murali";
		this.marks = 95.6f;
	}
	
    public static void main(String[] args) {
    	System.out.println("");
    	ConDemo cm = new ConDemo();
    	System.out.println("Roll No is :" + cm.rollno);
    	System.out.println("Name is :" + cm.name);
    	System.out.println("Marks :" + cm.marks);
    }
}
