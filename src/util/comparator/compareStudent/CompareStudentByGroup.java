package util.comparator.compareStudent;

import data.classes.Student;

import java.util.Comparator;

public class CompareStudentByGroup {
    public  Comparator<Student> StudentParam1Comparator = new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                String group1 = s1.getGroup().toUpperCase();
                String group2 = s2.getGroup().toUpperCase();

                return group1.compareTo(group2);

            }};
}
