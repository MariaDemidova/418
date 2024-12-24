import action.GetFromManual;
import action.GetFromRandom;
import action.Print;
import console.ConsoleUI;
import util.ListsCreator;

public class Main {

    public static ListsCreator ListsCreator = new ListsCreator();


    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI(new GetFromManual(ListsCreator), new Print(ListsCreator), new GetFromRandom(ListsCreator));
        ui.run();
    }
}