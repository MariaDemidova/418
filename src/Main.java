import action.GetFromManual;
import action.GetFromRandom;
import action.Print;
import console.ConsoleUI;
import generator.Generator;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Generator generator = new Generator();


    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI(new GetFromManual(generator), new Print(generator), new GetFromRandom(generator));
        ui.run();
    }
}