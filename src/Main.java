import action.*;
import console.ConsoleUI;
import util.ListsCreator;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private final Map<UserChoice, IAction> choiceAndAction = new HashMap<>();
    public static ListsCreator listsCreator = new ListsCreator();

    public void addChoice(UserChoice choice, IAction action) {

        choiceAndAction.put(choice, action);
    }

    public void run() {
        ConsoleUI consoleUI = new ConsoleUI(choiceAndAction);
        consoleUI.run();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addChoice(UserChoice.GET_FROM_FILE, new GetFromFile(listsCreator));
        main.addChoice(UserChoice.GET_FROM_RANDOM, new GetFromRandom(listsCreator));
        main.addChoice(UserChoice.GET_FROM_MANUAL, new GetFromManual(listsCreator));
        main.addChoice(UserChoice.PRINT, new Print(listsCreator));
        main.addChoice(UserChoice.FIND, new Find(listsCreator));
//        main.addChoice(UserChoice.SORT, new Sort(listsCreator));
        main.run();
    }
}
