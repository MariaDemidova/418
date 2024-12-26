package UI;

import util.Checker;

import java.util.*;

public class FillArrayByManualMethods {

    public Map<String, String> getFromManual(String param1, String param2, String param3, String type) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("Введите " + param1);
        map.put(param1, sc.nextLine());

        System.out.println("Введите " + param2);
        map.put(param2, sc.nextLine());

        System.out.println("Введите " + param3);
        map.put(param3, sc.nextLine());
        map.put("type", type);
        return map;
    }

    public Map<String, String> getEntitiesParamsFromManual(String typeArr) {
        return switch (typeArr) {
            case "1" -> getBus(typeArr);
            case "2" -> getUser(typeArr);
            case "3" -> getStudent(typeArr);
            default -> null;

        };
    }

    private Map<String, String> getBus(String type) {

        return getFromManual("номер", "модель", "пробег", type);
    }

    private Map<String, String> getUser(String type) {
        return getFromManual("имя", "пароль", "почта", type);
    }

    private Map<String, String> getStudent(String type) {
        return getFromManual("номер группы", "средний балл", "номер зачетной книжки", type);
    }

}
