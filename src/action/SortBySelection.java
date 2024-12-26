package action;

import util.ListsCreator;

import java.util.Map;

public class SortBySelection implements IAction{
    ListsCreator listsCreator;

    public SortBySelection(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    private void sort() {
        my.SortBySelection.sort(listsCreator.buses);

        System.out.println("Коллекции отсортированы");
    }

    @Override
    public String act(Map<String, String> params) {

        return "";
    }
}
