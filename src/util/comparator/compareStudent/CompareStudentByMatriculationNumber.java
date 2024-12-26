package util.comparator.compareStudent;

import data.classes.Student;

import java.util.Comparator;

public class CompareStudentByMatriculationNumber {
    public  Comparator<Student> StudentParam1Comparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String mn1 = s1.getMatriculationNumber().toUpperCase();
            String mn2 = s2.getMatriculationNumber().toUpperCase();

            return mn1.compareTo(mn2);

        }};
}
