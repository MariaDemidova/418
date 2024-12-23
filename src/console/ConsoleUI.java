package console;

import action.GetFromManual;
import action.Print;
import generator.Generator;

import java.util.*;

import static validation.validation.*;

public class ConsoleUI {
    private static final String FILL_ARR = "1";
    private static final String PRINT_ARR = "2";
    private static final String SORT_ARR = "3";
    private static final String EXIT = "0";
    private static final String ASK_CHOICE_METHOD = "Выберете способ заполнения массива: 1 - из файла, 2 - рандомно, 3 - вручную";
    private static final String ASK_LENGTH_ARR = "Задайте длину массива";
    private MethodsForUI methodsForUI = new MethodsForUI();
    private GetFromManual getFromManual;
    private Print print;
    private final Scanner scanner = new Scanner(System.in);
    private List<String> emptyParams = new ArrayList<>();


    public ConsoleUI(GetFromManual getFromManual, Print print) {

        this.getFromManual = getFromManual;
        this.print = print;
    }

    public void printMenu() {
        System.out.println("Что Вы хотите сделать?");
        System.out.println("1-создать массив");
        System.out.println("2-напечатать массив");
        System.out.println("3-сортировать массив");
        System.out.println("0-выход");
    }

    private void showErrMessage() {
        System.out.println("Вы что-то ввели не так");
    }

    public void run() {
        String userAnswer = "";

        while (!userAnswer.strip().equalsIgnoreCase(EXIT)) {
            printMenu();
            userAnswer = scanner.nextLine().strip().toLowerCase();
            switch (userAnswer) {
                case FILL_ARR -> addArrOfParams();
                case PRINT_ARR -> printArray();
                case SORT_ARR -> System.out.println("заглушка сортировать массив");
                case EXIT -> {
                }
                default -> showErrMessage();
            }

        }
    }

    public Integer getLenghtArr() {
        System.out.println(ASK_LENGTH_ARR);
        String userAnswer = scanner.nextLine().strip().toLowerCase();
        if (userAnswer.matches("[-+]?\\d+")) {
            int count = Integer.parseInt(userAnswer);
            if (count > 0)
                return count;
            else if (count == -1)
                return null;
        }
        showErrMessage();
        return getLenghtArr();

    }

    public String getMethodOfFillArray() {
        System.out.println(ASK_CHOICE_METHOD);
        String userAnswer = scanner.nextLine().strip().toLowerCase();
        if (validateMethod(userAnswer)) {
            return userAnswer;
        } else if (userAnswer.equals("0"))
            return null;

        showErrMessage();
        return getMethodOfFillArray();
    }

    public String getTypeArray() {
        System.out.println("Выберите тип объектов 1-bus. 2-User, 3-Student ");
        String userAnswer = scanner.nextLine().strip().toLowerCase();

        if (validateType(userAnswer)) {
            return userAnswer;
        } else if (userAnswer.equals("0"))
            return null;
        showErrMessage();
        return getTypeArray();
    }

    public void addArrOfParams() {
        String typeArr = null;
        Integer length = 0;
        String getMethod = getMethodOfFillArray();

        if (validateMethod(getMethod)) {
            typeArr = getTypeArray();
        }
        if (validateType(typeArr)) {
            length = getLenghtArr();
        }
        if (validateMethod(getMethod)) {
            switch (getMethod) {
                case "1" -> addFile(typeArr);
                case "2" -> addRandom(typeArr, length);
                case "3" -> addManual(typeArr, length);
            }
        }
    }

    private void addRandom(String typeArr, Integer lenghtArr) {
        System.out.println("rand");
    }

    private void addFile(String typeArr) {
        System.out.println("file");

    }

    private void addManual(String typeArr, Integer lengthArr) {
        for (int i = 0; i < lengthArr; i++) {
            switch (typeArr) {
                case "1" -> System.out.println("Заполняем данные автобуса" + (i + 1));
                case "2" -> System.out.println("Заполняем данные юзера" + (i + 1));
                case "3" -> System.out.println("Заполняем данные студента" + (i + 1));
            }
            Map<String, String> entity = methodsForUI.getEntitiesParamsFromManual(typeArr);
            String status = getFromManual.act(entity);
        }

    }

    private void printArray() {
        String typeArr = getTypeArray();
//        if (typeArr == null)
//            return;
//        if (!validateType(typeArr)) {
//            showErrMessage();
//            return;
//        }

        String status = print.act(new HashMap<>(Map.of("type", typeArr)));
        System.out.println(status);
    }
}




