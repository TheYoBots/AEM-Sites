package Day1;

public class TestStudent {
    // Execution flow:
    /*
      * After Run Command
      * Load the class
      * Allocate memory to all the static variables
      * Execute all static blocks
      * Create object
      * Allocate memory to all the instance (non-static) variables
      * Call constructor to initialize instance (non-static) variables
    */
    public static void main(String[] args) {
        System.out.println("main()");

        Student s; // Object reference created
        s = new Student(); // New object created

        System.out.println("For s: " + s);

        /*
        Student s2 = new Student();

        System.out.println("For s2: " + s2);

        Student s3 = new Student("Ram", 22, "Aayodhya");

        System.out.println("For s3: " + s3.toString());
        */
    }
}
