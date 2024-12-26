package application.action;

import data.classes.Bus;
import data.classes.Student;
import data.classes.User;
import application.files.WorkWithFiles;

import data.ListsCreator;

import java.io.FileNotFoundException;
import java.util.Map;


public class GetFromFile implements IAction {
    private final ListsCreator listsCreator;

    public GetFromFile(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    private void getFromFile(Map<String, String> params) throws FileNotFoundException {
        int type = Integer.parseInt(params.get("type"));
        int length = Integer.parseInt(params.get("length"));
        switch (type) {
            case 1 -> {
                for (int i = 0; i < length; i++) {
                    listsCreator.buses.add((Bus) WorkWithFiles.getDataFromFile(type, length).get(i));
                }
            }
            case 2 -> {
                for (int i = 0; i < length; i++) {
                    listsCreator.users.add((User) WorkWithFiles.getDataFromFile(type, length).get(i));
                }
            }
            case 3 -> {
                for (int i = 0; i < length; i++) {
                    listsCreator.students.add((Student) WorkWithFiles.getDataFromFile(type, length).get(i));
                }
            }
        }

    }

    @Override
    public String act(Map<String, String> params) {
        try {
            getFromFile(params);
            System.out.println("Массив успешно взят из файла");

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        return "";
    }
}
