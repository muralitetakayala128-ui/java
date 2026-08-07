package stop;

interface H{
	int x=4;
	void schl();
}
interface E{
	int y=11;
	void clg();
}
class Btech implements H,E{

	public void clg() {
		System.out.println("refferral E.H school");
	}
	public void schl() {
	 System.out.println("sri chaitanya");	
	}
	
}
public class Interface  {
	public static void main(String[] args) {
		Btech obj=new Btech();
		obj.clg();
		obj.schl();
	}
}
