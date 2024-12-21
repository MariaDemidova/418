package console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static validation.validation.*;

public class ConsoleUI {
    private static final String FILL_ARR = "1";
    private static final String PRINT_ARR = "2";
    private static final String SORT_ARR = "3";
    private static final String EXIT = "0";
    private static final String ASK_CHOICE_METHOD = "Выберете способ заполнения массива: 1 - из файла, 2 - рандомно, 3 - вручную";
    private static final String ASK_LENGTH_ARR = "Задайте длину массива";
    private static final String ASK_WHAT_TO_DO_NEXT = "Выберете способ заполнения массива: 1 - из файла, 2 - рандомно, 3 - вручную";
    private static final String ASK_EXIT = "Если хотите выйти, нажмите 0";

    private final Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Что Вы хотите сделать?");
        System.out.println("1-создать массив");
        System.out.println("2-напечатать массив");
        System.out.println("3-сортировать массив");
        System.out.println("0-выход");
    }

    public void run() {
        String userAnswer = "";

        while (!userAnswer.strip().equalsIgnoreCase(EXIT)) {
            printMenu();
            userAnswer = scanner.nextLine().strip().toLowerCase();
            switch (userAnswer) {
                case FILL_ARR -> addArray();
                case PRINT_ARR -> System.out.println("заглушка печатать массив");
                case SORT_ARR -> System.out.println("заглушка сортировать массив");
                case EXIT -> {}
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

    public void addArray() {
        String typeArr = null;
        Integer lenghtArr = 0;
        String getMethod = getMethodOfFillArray();
//        if (getMethod == null) {
//            return;
//        }
        if (validateMethod(getMethod)) {
            typeArr = getTypeArray();
        }
        if (validateType(typeArr)) {
            lenghtArr = getLenghtArr();
        }
        if (validateMethod(getMethod)) {
            switch (getMethod) {
                case "1" -> addFile(typeArr);
                case "2" -> addRandom(typeArr, lenghtArr);
                case "3" -> addManual(typeArr, lenghtArr);
            }
        }
    }

    private void addRandom(String typeArr, Integer lenghtArr) {
        System.out.println("rand");
    }

    private void addFile(String typeArr) {
        System.out.println("file");

    }

    private void addManual(String typeArr, Integer lenghtArr) {
        System.out.println("manual");

    }
    private void showErrMessage() {
        System.out.println("Вы что-то ввели не так");
    }
}
