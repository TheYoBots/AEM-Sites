package Day1;
// IS-A relationship
public class Student extends Person {
    // instance variable allocate memory after object creation
    int rollNo;
    MyDate dob; // HAS-A relationship

    // Class variables allocate memory before object creation
    static String schoolName;

    // Static block execute before object creation
    static {
        schoolName = "GRIET";
        System.out.println("Static block");
    }

    // Static method
    static void printSchool() {
        System.out.println("School Name: " + schoolName);
    }

    // Default constructor -  invoke after object creation
    public Student() {
        super(); // calling super class constructor
        rollNo = 11;
        dob = new MyDate();

        System.out.println("Student()");
    }

    // Constructor with parameter invoke after object creation
    public Student(String name, int rollNo, String address) {
        super(name, address); // calling super class constructor
        this.rollNo = rollNo;

        System.out.println("Student(-,-,-)");
    }

    // Method Overriding: runtime or dynamic polymorphism
    public void printName() {
        System.out.println("Student name is " + this.name);
    }

    // will call while printing object
    @Override
    public String toString() {
        return "Student[rollo=" + rollNo + ", dob=" + dob + "name=" + name + ", address=" + address + "]";

}
