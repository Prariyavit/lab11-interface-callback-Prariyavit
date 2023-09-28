package ku.cs.services;

import ku.cs.models.Student;
import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String id1 = o1.getId();
        String id2 = o2.getId();

        int min = Math.min(id1.length(), id2.length());

        for (int i = 0; i < min; i++) {
            char char1 = id1.charAt(i);
            char char2 = id2.charAt(i);

            if (char1 != char2) {
                return char1 - char2;
            }
        }

        return id1.length() - id2.length();
    }
}
