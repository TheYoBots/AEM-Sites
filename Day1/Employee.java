package Day1;

public class Employee extends Person {
	int eid, salary;
	String position;
	
	public Employee() {
		super();
		eid=349;
		salary=30000;
		position="ASE";
	}

	public Employee(String name, String address, int eid, int salary, String position) {
		super(name,address);
		this.eid = eid;
		this.salary = salary;
		this.position = position;
	}

	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", eid=" + eid + ", salary=" + salary + ", position=" + position + "]";
	}

}
