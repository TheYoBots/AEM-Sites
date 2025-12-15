package Day1;

public class Student extends Person {
	int rollNumber;
	static String schoolName;
	
	static {
		schoolName = "GRIET - Hyderabad";
//		System.out.println("static block");
	}
	
	static void printSchool() {
		System.out.println("schoolName: " + schoolName);
	}
	
	public Student() {
		super();
		rollNumber = 349;
//		System.out.println("Student()");
	}

	public Student(String name, int rollNumber, String address) {
		super(name,address);
		this.rollNumber = rollNumber;
//		System.out.println("Student(-,-,-)");
	}

	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", address=" + address + "]";
	}

}
