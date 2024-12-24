package action;

import util.DataError;
import util.ListsCreator;
import util.generator.BusGenerator;
import util.generator.StudentGenerator;
import util.generator.UserGenerator;

import java.util.Map;

public class GetFromManual implements IAction {
    private final ListsCreator listsCreator;

    public GetFromManual(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    public void loadEntity(Map<String, String> entity) throws DataError {
        switch (entity.get("type")) {
            case "1" -> listsCreator.addBus(BusGenerator.generateBus(entity));
            case "2" -> listsCreator.addUser(UserGenerator.generateUser(entity));
            case "3" -> listsCreator.addStudent(StudentGenerator.generateStudent(entity));
        }
    }

    @Override
    public String act(Map<String, String> entity) {
        try {
            loadEntity(entity);
        } catch (DataError e) {
           return e.getMessage();
        }

        return "создан объект ";
    }
}
