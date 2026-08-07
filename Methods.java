package sample.java;

public class Methods{
	int x=10,y=20;
	int c=x+y;
	void  addition() { 
		 System.out.println("result:" + c);

	 }
	 void subtration() {
		 System.out.println("result:"+(x-y));
	 }
	 
	public static void main(String[] args) {
		System.out.println("hello word");
		Methods m = new Methods();
		m.addition();
		m.subtration();
	}
}
