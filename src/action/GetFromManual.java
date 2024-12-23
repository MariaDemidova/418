package action;


import generator.Generator;
import java.util.List;
import java.util.Map;

public class GetFromManual implements IAction {
    private final Generator generator;

    public GetFromManual(Generator generator) {
        this.generator = generator;
    }

    public void loadEntity(Map<String, String> entity) {
         switch (entity.get("type")) {
             case "1" -> generator.generateBus(entity);
             case "2" -> generator.generateUser(entity);
             case "3" -> generator.generateStudent(entity);
         }
    }

    @Override
    public String act(Map<String, String> entity) {
        loadEntity(entity);

        return "создан объект ";
    }
}
