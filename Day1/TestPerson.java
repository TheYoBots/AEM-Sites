package Day1;

public class TestPerson {
	static void printPerson(Student stud) {
		System.out.println(stud);
	}
	
	public static void main(String[] args) {
		System.out.println("main() of TestPerson");
		
		printPerson(new Student());
		
		Student stud = new Student();
		System.out.println(stud);
		
		Employee emp = new Employee();
		System.out.println(emp);
		
		Person per = new Person();
		System.out.println(per);
	}

}