package OOps;

class Shape{
	public void Area() {
		System.out.println("Area");
	}
	
	}

class Triangle extends Shape{
	public void Area(int l,int b) {
		System.out.println(l*b*0.5);
	}
}
class EqTriangle extends Shape{
	public void area(int l,int b) {
		System.out.println(l*b*0.5);
	}
}
class circle extends Shape{
	public void area(int r) {
		System.out.println(3.147*r*r);
	}
}
public class inheritance {
	public static void main(String args[]) {
		Triangle  t0=new Triangle();
		t0.Area(3,5);
		
		EqTriangle t1=new EqTriangle();
	    t1.area(2, 3);
	    
	    circle c0=new circle();
	    c0.Area();
	    c0.area(2);
	}
	
}
	

