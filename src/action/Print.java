package action;

import generator.Generator;
import temp.Bus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Print implements IAction {
    Generator generator;

    public Print(Generator generator) {
        this.generator = generator;
    }
    //    private static String printObjects(List<Object> objects) {
//        if (objects.isEmpty()) {
//            return "тут ничего нет";
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        String typeOfCollection = objects.getFirst().getClass().getSimpleName().toLowerCase();
//        stringBuilder.append("=== Коллекция ").append(typeOfCollection).append(": ===\n");
//        int collectionSize = objects.size();
//        for (int i = 0; i < collectionSize; i++) {
//            stringBuilder.append(i + 1).append(": ").append(objects.get(i));
//            if (i != collectionSize - 1)
//                stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }

//    public String takeArray(List<String> params, String type) {
//        switch (type) {
//            case "1" -> generator.getBuses();
//            case "2" -> generator.getBuses();
//            case "3" -> generator.getBuses();
//        };
//        return
//    }

    @Override
    public String act(Map<String, String> entity) {

        return Arrays.asList(generator.buses).toString();
    }
}
