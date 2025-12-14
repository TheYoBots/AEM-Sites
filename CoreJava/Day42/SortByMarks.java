package Day42;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        System.out.println("SortByMarks");

        if(o1.marks < o2.marks)
            return 1;
        else if(o1.marks > o2.marks)
            return -1;
        return 0;
    }
}