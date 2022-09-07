package OOps;
class Pen{
	String color;
	String type;
	public void write() {
	
	System.out.println("Something");
	}
	public void printcoltype() {
	System.out.println(this.color);
	System.out.println(this.type);
	
	}
}


public class PenClass {
	public static void main(String args[]) {
		Pen s1=new Pen();
		s1.color="blue";
		s1.type="gel";
		s1.write();
		
		Pen s2=new Pen();
		s2.color="red";
		s2.type="dot";
		
		s1.printcoltype();
		s2.printcoltype();
	}

}
