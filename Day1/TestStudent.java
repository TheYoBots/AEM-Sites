package Day1;

public class TestStudent {
	void printPerson(Student stud) {
		System.out.println(stud);
	}
	
	public static void main(String[] args) {
		System.out.println("main() of TestStudent");
		
		TestPerson test = new TestPerson();
		test.printPerson(new Student());
		
		Student s;
		s = new Student();
		
		System.out.println("For S: " + s);
		
		Employee s2 = new Employee();
		
		System.out.println("For S2: " + s2);
		
		Student s3 = new Student("Uday", 350, "Bangalore");
		System.out.println("For S3: " + s3.toString());
	}

}