package util.comparator.compareStudent;

import data.classes.Student;

import java.util.Comparator;

public class CompareStudentByGpa {
    public  Comparator<Student> StudentParam1Comparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            double gpa1 = s1.getGpa();
            double gpa2 = s2.getGpa();

            // Sorting in ascending order
            return Double.compare(gpa1, gpa2);

        }};
}
