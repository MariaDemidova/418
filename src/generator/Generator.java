package generator;

import temp.Bus;
import temp.Model;
import temp.Student;
import temp.User;

import java.util.*;

public class Generator {
    public List<Bus> buses;
    public List<User> users;
    public List<Student> students;

    public Generator() {
        this.buses = new ArrayList<>();
        this.users = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void generateBus(Map<String, String> entity) {
        Bus bus = new Bus();
        bus.setParam1(entity.get("номер"));
        bus.setParam2(entity.get("модель"));
        bus.setParam3(entity.get("пробег"));
        buses.add(bus);
    }

    public void generateUser(Map<String, String> entity) {
        User user = new User();
        user.setParam1(entity.get("имя"));
        user.setParam2(entity.get("пароль"));
        user.setParam3(entity.get("почта"));
        users.add(user);
    }

    public void generateStudent(Map<String, String> entity) {
        Student student = new Student();
        student.setParam1(entity.get("номер группы"));
        student.setParam2(entity.get("средний балл"));
        student.setParam3(entity.get("номер зачетной книжки"));
        students.add(student);
    }
}
