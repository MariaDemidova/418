package action;

import classes.Bus;
import classes.Student;
import classes.User;
import my.Search;
import util.DataError;
import util.ListsCreator;
import util.generator.BusGenerator;
import util.generator.StudentGenerator;
import util.generator.UserGenerator;

import java.util.Map;

public class Find implements IAction {

    ListsCreator listsCreator;

    public Find(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    private String find(Map<String, String> params) {
        int result;
        switch (params.get("type")) {
            case "1" -> {

                try {
                    Bus bus = BusGenerator.generateBus(params);
                    result = Search.binarySearch(listsCreator.buses, bus);
                } catch (DataError e) {
                    result = -1;
                }
                if (result >= 0) {
                    return listsCreator.users.get(result).toString();
                }
            }
            case "2" -> {
                User user = null;
                try {
                    user = UserGenerator.generateUser(params);
                    result = Search.binarySearch(listsCreator.users, user);
                } catch (DataError e) {
                    result = -1;
                }
                if (result >= 0) {
                    return listsCreator.users.get(result).toString();
                }
            }
            case "3" -> {
                Student student = null;
                try {
                    student = StudentGenerator.generateStudent(params);
                    result = Search.binarySearch(listsCreator.students, student);
                } catch (DataError e) {
                    result = -1;
                }
                if (result >= 0) {
                    return listsCreator.students.get(result).toString();
                }
            }
        }
        return "Тут таких нет ((";
    }

    @Override
    public String act(Map<String, String> params) {
        String s = find(params);
        return s;
    }
}
