


public class ConDemo {
int rollno;
String name;
float fee;
public ConDemo() {
	this.rollno= 257;
	this.name=" Murali";
	this.fee=257.56f;
	
	
}
void sample() {
	System.out.println("rollno is:" + this.rollno);
	System.out.println("name is:" + this.name);
	System.out.println("fee is:" + this.fee);
}
	public static void main(String[] args) {
		System.out.println("hello ");
		 ConDemo cd= new ConDemo();
		 cd.sample();
	}
		
}
	
	
		
	
	
	

