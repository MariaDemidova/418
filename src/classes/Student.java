package classes;

public class Student {
    private final String group;
    private final double gpa;
    private final String matriculationNumber;

    public Student(StudentBuilder studentBuilder) {
        group = studentBuilder.group;
        gpa = studentBuilder.gpa;
        matriculationNumber = studentBuilder.matriculationNumber;
    }

    public String getGroup() {
        return group;
    }

    public Double getGpa() {
        return gpa;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public static class StudentBuilder{
        private String group;
        private double gpa;
        private String matriculationNumber;

        public StudentBuilder group(String group) {
            this.group = group;
            return this;
        }

        public StudentBuilder gpa(double gpa) {
            this.gpa = gpa;
            return this;
        }

        public StudentBuilder matriculationNumber(String matriculationNumber) {
            this.matriculationNumber = matriculationNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
