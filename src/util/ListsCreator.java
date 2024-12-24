package util;

import classes.Bus;
import classes.Student;
import classes.User;

import java.util.*;

public class ListsCreator {
    public List<Bus> buses;
    public List<User> users;
    public List<Student> students;

    public ListsCreator() {
        this.buses = new ArrayList<>();
        this.users = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addBus(Bus bus) {
            buses.add(bus);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
