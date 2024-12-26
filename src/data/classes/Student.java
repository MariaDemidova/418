package data.classes;

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
            if(!group.equals(o.group))
                return group.compareTo(o.group);
            if (gpa != o.gpa)
                return Double.compare(this.gpa, o.gpa);
            return matriculationNumber.compareTo(o.matriculationNumber);
    }

    @Override
    public String toString(){
        return "Студент{" +
                "номер группы='" + group + '\'' +
                ", средний балл='" + gpa + '\'' +
                ", номер зачетки=" + matriculationNumber +
                '}';
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
