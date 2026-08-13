package method;

public class Noreturn {
 void add(int a ,int b) {
	 System.out.println("sum="+(a+b));
 }
 public static void main(String[] args) {
	 Noreturn obj=new Noreturn();
			 obj.add(5, 10);
 }
}
