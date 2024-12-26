package action;

import util.ListsCreator;

import java.util.Collections;
import java.util.Map;

public class CollectionSort implements IAction{
    ListsCreator listsCreator;

    public CollectionSort(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    private void collectionSort() {
        Collections.sort(listsCreator.buses);
        Collections.sort(listsCreator.users);
        Collections.sort(listsCreator.students);
    }

    @Override
    public String act(Map<String, String> params) {
        collectionSort();
        return "";
    }
}
