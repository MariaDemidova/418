package util;

import java.util.Arrays;
import java.util.Map;

public class Checker {

    public static boolean checkBus(Map<String, String> model) throws DataError {
        String licensePlate = model.get("номер");
        if (licensePlate == null)
            throw new DataError("Нужно поле licensePlate");
        else if (licensePlate.isEmpty())
            throw new DataError("У вас пустое поле licensePlate, так не должно быть");

        String BusModel = model.get("номер");
        if (BusModel == null)
            throw new DataError("Нужно поле model");
        else if (BusModel.isEmpty())
            throw new DataError("У вас пустое поле model, так не должно быть");

        String mileage = (model.get("пробег"));
        if (mileage == null)
            throw new DataError("Нужно поле mileage");
        if (model.isEmpty())
            throw new DataError("У вас пустое поле mileage, так не должно быть");
        if (!mileage.matches("[0-9]+")) {
            throw new DataError("пробег должен быть числовым значением больше нуля");
        }

        return true;
    }

    public static boolean checkUser(Map<String, String> model) throws DataError {
        String name = model.get("имя");
        if (name == null)
            throw new DataError("Нужно поле name");
        else if (name.isEmpty())
            throw new DataError("У вас пустое поле name, так не должно быть");

        String password = model.get("пароль");
        if (password == null)
            throw new DataError("Нужно поле password");
        else if (password.isEmpty())
            throw new DataError("У вас пустое поле password, так не должно быть");

        String mail = model.get("почта");
        if (mail == null)
            throw new DataError("Нужно поле mail");
        else if (mail.isEmpty())
            throw new DataError("У вас пустое поле mail, так не должно быть");

        return true;
    }

    public static boolean checkStudent(Map<String, String> model) throws DataError {

        String group = model.get("номер группы");
        if (group == null)
            throw new DataError("Нужно поле group");

        else if (group.isEmpty())
            throw new DataError("У вас пустое поле group, так не должно быть");

        String gpa = model.get("средний балл");
        if (gpa == null)
            throw new DataError("Нужно поле gpa");

        if (!gpa.matches("[0-9]+")) {
            throw new DataError("средний балл должен быть double значением больше нуля");
        }

        if (Boolean.parseBoolean(gpa))
            throw new DataError("средний балл должен быть типа double");

        else if (gpa.isEmpty())
            throw new DataError("У вас пустое поле gpa, так не должно быть");

        String matriculationNumber = model.get("номер зачетной книжки");
        if (matriculationNumber == null)
            throw new

                    DataError("Нужно поле matriculationNumber");
        else if (matriculationNumber.isEmpty())
            throw new

                    DataError("У вас пустое поле matriculationNumber, так не должно быть");

        return true;
    }


    public static boolean checkMainMenuAnswer(String inputMethod) {
        return (Arrays.asList("1", "2", "3", "4").contains(inputMethod));
    }

    public static boolean checkValidType(String type) {

        return (Arrays.asList("1", "2", "3").contains(type));
    }

    public static boolean checkValidMethod(String inputMethod) {
        return (Arrays.asList("1", "2", "3", "4").contains(inputMethod));
    }
}