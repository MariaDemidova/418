package action;

import util.ListsCreator;

import java.util.Arrays;
import java.util.Map;

public class Print implements IAction {
   private final ListsCreator ListsCreator;

    public Print(ListsCreator ListsCreator) {
        this.ListsCreator = ListsCreator;
    }

    @Override
    public String act(Map<String, String> entity) {
     return    switch (entity.get("type")) {
            case "1" -> Arrays.asList(ListsCreator.buses).toString();
            case "2" -> Arrays.asList(ListsCreator.users).toString();
            case "3" -> Arrays.asList(ListsCreator.students).toString();
            default -> throw new IllegalArgumentException("Invalid type");//TODO
        };

    }
}
