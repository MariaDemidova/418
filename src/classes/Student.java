package classes;

public class Student implements Comparable<Student>{
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

    public double getGpa() {
        return gpa;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    @Override
    public int compareTo(Student o) {
        int result=(int)(this.gpa-(o.gpa));
        return result;
    }

    @Override
    public String toString(){
        return (matriculationNumber+", "+group+", gpa: "+ gpa);
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
