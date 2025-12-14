package Day1;

public class TestStudent {
    // Method Overloading, Static or Compile type Polymorphism
    /*
    static void printPerson(Student var) {
        System.out.println(var);
    }

    static void printPerson(Employee var) {
        System.out.println(var);
    }
    */

    static void printPerson(Person var) {
        System.out.println(var);
    }

    public static void main(String[] args) {
        System.out.println("Main TestPerson");

        boolean flag = true;
        boolean flag2 = false;

        // TestPerson test = new TestPerson();
        // TestPerson.printPerson(new Student());

        Student stud = new Student();
        System.out.println(stud);

        Employee emp = new Employee();
        System.out.println(emp);

        Object per = new Person();
        per = new Student();
        per = new Employee();
        per = new MyDate();

        per.printName();
        stud.printName();
        emp.printName();

        System.out.println(per);
    }
}