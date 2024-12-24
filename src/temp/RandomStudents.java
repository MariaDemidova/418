package temp;

public class RandomStudents {
    private static final String[] GROUP_NUMBER = new String[]{
            "1-1", "1-2", "1-3", "2-1", "2-2", "2-3", "3-1", "3-2", "3-3", "4"};
    private static final double[] GPA = new double[]{
            3.3, 2.1, 4.2, 2.1, 5.0, 4.2, 2.3, 3.7, 2.6, 6.3};

    private static final String[] NUMBER = new String[]{
            "123", "223", "111", "128", "4445", "667", "222", "345", "621", "127"};

    public String[] getRandomGroupNumbers() {
        return GROUP_NUMBER;
    }

    public double[] getRandomGPAs() {
        return GPA;
    }

    public String[] getRandomNumber() {
        return NUMBER;
    }
}
