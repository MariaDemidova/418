package action;

import generator.Generator;
import temp.Bus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Print implements IAction {
   private final Generator generator;

    public Print(Generator generator) {
        this.generator = generator;
    }

    @Override
    public String act(Map<String, String> entity) {
     return    switch (entity.get("type")) {
            case "1" -> Arrays.asList(generator.buses).toString();
            case "2" -> Arrays.asList(generator.users).toString();
            case "3" -> Arrays.asList(generator.students).toString();
            default -> throw new IllegalArgumentException("Invalid type");//TODO
        };

    }
}
