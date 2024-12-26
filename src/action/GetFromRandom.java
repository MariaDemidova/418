package action;

import classes.Bus;
import classes.Student;
import classes.User;
import util.ListsCreator;
import randomEntity.RandomBuses;
import randomEntity.RandomStudents;
import randomEntity.RandomUsers;

import java.util.Map;
import java.util.Random;

public class GetFromRandom implements IAction {
    private final ListsCreator ListsCreator;
    Random rand = new Random();
    RandomBuses buses = new RandomBuses();
    RandomUsers users = new RandomUsers();
    RandomStudents students = new RandomStudents();

    public GetFromRandom(ListsCreator ListsCreator) {
        this.ListsCreator = ListsCreator;
    }

    private Bus randomBus() {
        Bus.BusBuilder bus = new Bus.BusBuilder();
        String[] numbers = buses.getRandomNumbers();
        String[] models = buses.getRandomModels();
        int[] km = buses.getRandomKM();

        bus.licensePlate(numbers[rand.nextInt(numbers.length)]);
        bus.model(models[rand.nextInt(numbers.length)]);
        bus.mileage(km[rand.nextInt(numbers.length)]);

        return bus.build();
    }

    private User randomUser() {
        User.UserBuilder userBuilder = new User.UserBuilder();
        String[] names = users.getRandomNames();
        String[] passwords = users.getRandomPassword();
        String[] emails = users.getRandomEmail();

        userBuilder.name(names[rand.nextInt(names.length)]);
        userBuilder.password(passwords[rand.nextInt(passwords.length)]);
        userBuilder.mail(emails[rand.nextInt(emails.length)]);

        return userBuilder.build();
    }

    private Student randomStudent() {
        Student.StudentBuilder student = new Student.StudentBuilder();

        String[] groupNumbers = students.getRandomGroupNumbers();
        double[] GPAs = students.getRandomGPAs();
        String[] numbers = students.getRandomNumber();

        student.group(groupNumbers[rand.nextInt(numbers.length)]);
        student.gpa(GPAs[rand.nextInt(numbers.length)]);
        student.matriculationNumber(numbers[rand.nextInt(numbers.length)]);

        return student.build();
    }

    private String generateArr(String type, int length) {

        for (int i = 0; i < length; i++) {
            switch (type) {
                case "1" -> ListsCreator.addBus(randomBus());
                case "2" -> ListsCreator.addUser(randomUser());
                case "3" -> ListsCreator.addStudent(randomStudent());
            }
        }
        return "рандомный массив сформирован";
    }


    @Override
    public String act(Map<String, String> params) {
        String type = params.get("type");
        int length = Integer.parseInt(params.get("length"));
        generateArr(type, length);
        return "рандомный массив сформирован";
    }
}
