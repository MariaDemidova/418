package util.generator;

import data.classes.Student;
import util.DataError;

import java.util.Map;

import static util.Checker.checkStudent;

public class StudentGenerator {
    public static Student generateStudent(Map<String, String> entity) throws DataError {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder();

        checkStudent(entity);

        studentBuilder.group(entity.get("номер группы"));
        studentBuilder.gpa(Double.parseDouble(entity.get("средний балл")));
        studentBuilder.matriculationNumber(entity.get("номер зачетной книжки"));
        return studentBuilder.build();
    }
}
