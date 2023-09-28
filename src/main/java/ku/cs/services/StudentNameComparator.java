package ku.cs.services;

import ku.cs.models.Student;
import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        int min = Math.min(name1.length(), name2.length());

        for (int i = 0; i < min; i++) {
            char char1 = name1.charAt(i);
            char char2 = name2.charAt(i);

            if (char1  != char2) {
                return char1 - char2;
            }
        }

        return name1.length() - name2.length();
    }
}
