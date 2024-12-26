package application.files;

import data.classes.Bus;
import data.classes.Student;
import data.classes.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithFiles {

    public static <T> List<T> getDataFromFile(int typeClass, int length) throws FileNotFoundException {

        Scanner fileScan;
        List<T> itemList= new ArrayList<>();
        String[] line;


        switch (typeClass) {
            case 1:
                fileScan = new Scanner(new File("./Files/Buses.txt"));
                while(fileScan.hasNextLine()&& itemList.size()<=length-1){
                    line = fileScan.nextLine().split(", ");
                    itemList.add((T) takeBus(line));
                }
            break;
            case 3:
                fileScan  = new Scanner(new File("./Files/Students.txt"));
                while(fileScan.hasNextLine()&& itemList.size()<=length-1){
                    line = fileScan.nextLine().split(", ");
                    itemList.add((T) takeStudent(line));
                }
            break;
            case 2:
                fileScan  = new Scanner(new File("./Files/Users.txt"));
                while(fileScan.hasNextLine()&& itemList.size()<=length-1){
                    line = fileScan.nextLine().split(", ");
                    itemList.add((T) takeUser(line));
                }
            break;
    };
        return itemList;
    }


    public static Bus takeBus(String[] line)
    {
        try {
            int mileage = Integer.parseInt(line[2]);
            Bus bus = new Bus.BusBuilder().licensePlate(line[0]).model(line[1]).mileage(mileage).build();
            return bus;
        }
        catch (Exception ex) {
           System.out.println("The data in the file is incorrect");
        };
        return null;
    }

    public static Student takeStudent(String[] line)
    {
        try {
            double gpa = Double.parseDouble(line[2]);
            Student student = new Student.StudentBuilder().matriculationNumber(line[0]).group(line[1]).gpa(gpa).build();
            return student;
        }
        catch (Exception ex){
            System.out.println("The data in the file is incorrect");
        }
        return null;
    }

    public static User takeUser(String[] line)
    {
        try {
            User user= new User.UserBuilder().name(line[0]).mail(line[1]).password(line[2]).build();
            return user;
        }
        catch (Exception ex){
            System.out.println("The data in the file is incorrect");
        }
        return null;
    }

}
