package action;

import generator.Generator;
import temp.Bus;
import temp.RandomBuses;
import temp.RandomStudents;
import temp.RandomUsers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GetFromRandom implements IAction {
    private final Generator generator;
    Random rand = new Random();
    RandomBuses buses = new RandomBuses();
    RandomUsers users = new RandomUsers();
    RandomStudents students = new RandomStudents();

    public GetFromRandom(Generator generator) {
        this.generator = generator;
    }

    private Map<String, String> randomBus() {
        Map<String, String> bus = new HashMap();

        String[] numbers = buses.getRandomNumbers();
        String[] models = buses.getRandomModels();
        String[] km = buses.getRandomKM();
        bus.put("номер", numbers[rand.nextInt(buses.getRandomNumbers().length)]);
        bus.put("модель", models[rand.nextInt(buses.getRandomModels().length)]);
        bus.put("пробег", km[rand.nextInt(buses.getRandomKM().length)]);
        return bus;
    }

    private Map<String, String> randomStudent() {
        Map<String, String> student = new HashMap();

        String[] groupNumbers = students.getRandomGroupNumbers();
        double[] GPAs = students.getRandomGPAs();
        int[] numbers = students.getRandomNumber();

        student.put("номер группы", groupNumbers[rand.nextInt(students.getRandomNumber().length)]);
        student.put("средний балл", String.valueOf(GPAs[rand.nextInt(students.getRandomGPAs().length)]));
        student.put("номер зачетной книжки", String.valueOf(numbers[rand.nextInt(students.getRandomNumber().length)]));
        return student;
    }

    private Map<String, String> randomUser() {
        Map<String, String> user = new HashMap();

        String[] names = users.getRandomNames();
        String[] passwords = users.getRandomPassword();
        String[] emails = users.getRandomEmail();

        user.put("имя", names[rand.nextInt(users.getRandomNames().length)]);
        user.put("пароль", passwords[rand.nextInt(users.getRandomPassword().length)]);
        user.put("почта", emails[rand.nextInt(users.getRandomEmail().length)]);
        return user;
    }


    private String generateArr(String type, int length) {

        for (int i = 0; i < length; i++) {
            switch (type) {
                case "1" -> generator.generateBus(randomBus());
                case "2" -> generator.generateUser(randomUser());
                case "3" -> generator.generateStudent(randomStudent());

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
