package oop.java;
 
class A{
	int x=20;
}
class B extends A{
	int y=10;
}
class C extends B{
	void display() {
		System.out.println("x="+ x);
		System.out.println("y="+y);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		C obj=new C();
	 obj.display();
	}
}
