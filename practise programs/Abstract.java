package stop;

abstract class A{
	int x=5;
	void mode() {
		System.out.println("mode is max");
	}
	abstract void price();
}

public class Abstract extends A {
	void price() {
		System.out.println("price  of bike");
		
	}
	public static void main(String[] args) {
		Abstract obj=new Abstract();
		obj.mode();
		obj.price();
	}
	
}
