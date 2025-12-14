package Day2;

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Student {
    private MyDate dateOfBirth;

    public Student(MyDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" + "dateOfBirth=" + dateOfBirth + '}';
    }
}

class Date {
    public static void main(String[] args) {
        MyDate date = new MyDate(15, 8, 2000);
        Student s1 = new Student(date);
        
        System.out.println(s1);
        s1 = null;
        System.out.println("After: " + s1);
        System.out.println(date);
    }
}