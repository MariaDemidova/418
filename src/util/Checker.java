package util;

import java.util.Arrays;
import java.util.Map;

public class Checker {

    public static boolean checkBus(Map<String, String> model) {
        String licensePlate = model.get("номер");
        if (licensePlate == null)
            System.out.println("Нужно поле licensePlate");
        else if (licensePlate.isEmpty())
            System.out.println("У вас пустое поле licensePlate, так не должно быть");

        String BusModel = model.get("номер");
        if (BusModel == null)
            System.out.println("Нужно поле model");
        else if (BusModel.isEmpty())
            System.out.println("У вас пустое поле model, так не должно быть");

        int mileage = Integer.parseInt(model.get("пробег"));
        if (mileage == 0)
            System.out.println("Нужно поле mileage");
        if (model.isEmpty())
            System.out.println("У вас пустое поле mileage, так не должно быть");

        return true;
    }

    public static boolean checkUser(Map<String, String> model) {
        String name = model.get("имя");
        if (name == null)
            System.out.println("Нужно поле name");
        else if (name.isEmpty())
            System.out.println("У вас пустое поле name, так не должно быть");

        String password = model.get("пароль");
        if (password == null)
            System.out.println("Нужно поле password");
        else if (password.isEmpty())
            System.out.println("У вас пустое поле password, так не должно быть");

        String mail = model.get("почта");
        if (mail == null)
            System.out.println("Нужно поле mail");
        else if (mail.isEmpty())
            System.out.println("У вас пустое поле mail, так не должно быть");

        return true;
    }

    public static boolean checkStudent(Map<String, String> model) {

        String group = model.get("номер группы");
        if (group == null)
            System.out.println("Нужно поле group");
        else if (group.isEmpty())
            System.out.println("У вас пустое поле group, так не должно быть");

        String gpa = model.get("средний балл");
        if (gpa == null)
            System.out.println("Нужно поле gpa");
        else if (gpa.isEmpty())
            System.out.println("У вас пустое поле gpa, так не должно быть");

        String matriculationNumber = model.get("номер зачетной книжки");
        if (matriculationNumber == null)
            System.out.println("Нужно поле matriculationNumber");
        else if (matriculationNumber.isEmpty())
            System.out.println("У вас пустое поле matriculationNumber, так не должно быть");

        return true;
    }

    public static boolean checkMainMenuAnswer(String inputMethod) {
        return (Arrays.asList("1", "2", "3", "4").contains(inputMethod));
    }

    public static boolean validateType(String type) {
        return (Arrays.asList("1", "2", "3").contains(type));
    }
    public static boolean validateMethod(String inputMethod) {
        return (Arrays.asList("1", "2", "3").contains(inputMethod));
    }
}