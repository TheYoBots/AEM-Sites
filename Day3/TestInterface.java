package Day3;

public class TestInterface {
    public static void main(String[] args) {
        MyInterface2.printName();

        MyInterface interRef = new Developer();
        interRef = new Car();

        MyInterface interArr[] = new MyInterface[2];

        Vehicle absRef[] = new Vehicle[2];
    }
}