package application.action;

import data.ListsCreator;

import java.util.Collections;

public class CollectionSort {
    ListsCreator listsCreator;

    public CollectionSort(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    public void collectionSort() {
        Collections.sort(listsCreator.buses);
        Collections.sort(listsCreator.users);
        Collections.sort(listsCreator.students);
        System.out.println("все массивы были отсортированы сортировщиком Collections.sort");
    }

}
