package console;

import action.*;
import util.Checker;

import java.util.*;


public class ConsoleUI {
    private static final String FILL_ARR = "1";
    private static final String PRINT_ARR = "2";
    private static final String SORT = "4";
    private static final String SORT_DOP = "5";
    private static final String FIND = "6";
    private static final String EXIT = "9";
    private static final String ASK_CHOICE_METHOD = "Выберете способ заполнения массива: 1 - из файла, 2 - рандомно, 3 - вручную";
    private static final String ASK_LENGTH_ARR = "Задайте длину массива";

    private final FillArrayByManualMethods methodsForUI = new FillArrayByManualMethods();

    private final Scanner scanner = new Scanner(System.in);

    Map<UserChoice, IAction> choiceActions;

    public ConsoleUI(Map<UserChoice, IAction> choiceActions) {
        this.choiceActions = choiceActions;
    }

    public void printMenu() {
        System.out.println("Что Вы хотите сделать?");
        System.out.println("1-создать массив");
        System.out.println("2-напечатать массив");
        System.out.println("3-сортировать массив");
        System.out.println("4-найти элемент массива");
        System.out.println("5-сортировать массив по доп заданию");
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
                case FILL_ARR -> createArray();
                case PRINT_ARR -> printArray();
                case SORT -> sortArray();
                case SORT_DOP -> sortDop();
                case FIND -> binarySearch();
                case EXIT -> {
                }
                default -> showErrMessage();
            }
        }
    }



    public String getMethodOfFillArray() {
        System.out.println(ASK_CHOICE_METHOD);
        String userAnswer = scanner.nextLine();

        if (Checker.checkValidMethod(userAnswer)) {
            return userAnswer;
        } else if (userAnswer.equals("0"))
            return null;

        showErrMessage();
        return getMethodOfFillArray();
    }

    public Integer getLengthArr() {
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
        return getLengthArr();

    }

    public String getTypeArray() {
        System.out.println("Выберите тип объектов 1-bus. 2-User, 3-Student ");
        String userAnswer = scanner.nextLine().strip().toLowerCase();

        if (Checker.checkValidType(userAnswer)) {
            return userAnswer;
        } else showErrMessage();

        return getTypeArray();
    }

    public void createArray() {
        String typeArr = null;
        Integer length = 0;

        String getMethod = getMethodOfFillArray();

        if (Checker.checkValidMethod(getMethod)) {
            typeArr = getTypeArray();
        }
        if (Checker.checkValidType(typeArr)) {
            length = getLengthArr();
        }
        if (Checker.checkValidMethod(getMethod)) {
            switch (getMethod) {
                case "1" -> addFile(typeArr);
                case "2" -> addRandom(typeArr, length);
                case "3" -> getManual(typeArr, length);
            }
        }
    }

    private void addRandom(String typeArr, int length) {

        Map<String, String> temp = new HashMap<>();
        temp.put("type", typeArr);
        temp.put("length", String.valueOf(length));
        String status = choiceActions.get(UserChoice.GET_FROM_RANDOM).act(temp);
        System.out.println(status);
    }

    private void addFile(String typeArr) {
        System.out.println("file");

    }

    private void getManual(String typeArr, Integer lengthArr) {
        for (int i = 0; i < lengthArr; i++) {
            switch (typeArr) {
                case "1" -> System.out.println("Заполняем данные автобуса" + (i + 1));
                case "2" -> System.out.println("Заполняем данные юзера" + (i + 1));
                case "3" -> System.out.println("Заполняем данные студента" + (i + 1));
            }
            Map<String, String> entity = methodsForUI.getEntitiesParamsFromManual(typeArr);
            String status = choiceActions.get(UserChoice.GET_FROM_MANUAL).act(entity);
            System.out.println(status);
        }

    }

    private void printArray() {
        String typeArr = getTypeArray();
        if (typeArr == null)
            return;
        if (!Checker.checkValidType(typeArr)) {
            showErrMessage();
            return;
        }

        String status = choiceActions.get(UserChoice.PRINT).act(new HashMap<>(Map.of("type", typeArr)));
        System.out.println(status);
    }

    private void binarySearch() {
        String type = getTypeArray();
        if (type == null)
            return;

        System.out.printf("Ищем элемент типа ", type);
        Map<String, String> entity = methodsForUI.getEntitiesParamsFromManual(type);
        String response = choiceActions.get(UserChoice.FIND).act(entity);
        System.out.println(response);

    }
    private void sortArray() {
    }

    private void sortDop() {
    }


}




