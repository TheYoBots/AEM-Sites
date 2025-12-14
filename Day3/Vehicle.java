package Day3;

public abstract class Vehicle implements MyInterface {
    String colour, regNum;
    int wheels;

    public abstract void printRegNum();

    void print() {
        System.out.println("Vehicle Class");
    }

    public static void main(String[] args) {
        // Vehicle v = new Vehicle();

    }
}