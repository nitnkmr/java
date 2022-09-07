package OOps;

class Student{
	String name;
	String age;
	public void printdata() {
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	Student(String name,String age){
		this.age="22";
		this.name="Nitin";
	}
}

public class StudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Nitin", "22");
		
		
		s1.printdata();

	}

}
