package application.action;

import application.sort.SelectionSort;
import data.ListsCreator;
import util.comparator.compareBus.CompareBusByMileage;
import util.comparator.compareBus.CompareBusByModel;
import util.comparator.compareBus.CompareBusByNumber;
import util.comparator.compareStudent.CompareStudentByGpa;
import util.comparator.compareStudent.CompareStudentByGroup;
import util.comparator.compareStudent.CompareStudentByMatriculationNumber;
import util.comparator.compareUser.CompareUserByMail;
import util.comparator.compareUser.CompareUserByName;
import util.comparator.compareUser.CompareUserByPassword;

import java.util.Map;

public class SortBySelection implements IAction {
    public static ListsCreator listsCreator;
    public SelectionSort selectionSort = new SelectionSort();
    public CompareBusByModel compareBusByModel = new CompareBusByModel();
    public CompareBusByNumber compareBusByNumber =  new CompareBusByNumber();
    public CompareBusByMileage compareBusByMileage = new CompareBusByMileage();
    public CompareUserByName compareUserByName = new CompareUserByName();
    public CompareUserByPassword compareUserByPassword = new CompareUserByPassword();
    public CompareUserByMail compareUserByMail = new CompareUserByMail();
    public CompareStudentByGroup compareStudentByGroup = new CompareStudentByGroup();
    public CompareStudentByGpa compareStudentByGpa = new CompareStudentByGpa();
    public CompareStudentByMatriculationNumber compareStudentByMatriculationNumber =  new CompareStudentByMatriculationNumber();

    public SortBySelection(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    private void sort(Map<String, String> map) {//тип и элемент
        String type = map.get("type");
        String param = map.get("param");

        if (type.equals("1")) {
            switch (param) {
                case "1" -> selectionSort.selectionSort(listsCreator.buses, compareBusByNumber.BusParam1Comparator);
                case "2" -> selectionSort.selectionSort(listsCreator.buses, compareBusByModel.BusParam1Comparator);
                case "3" -> selectionSort.selectionSort(listsCreator.buses, compareBusByMileage.BusParam1Comparator);
            }
        }
        if (type.equals("2")) {
            switch (param) {
                case "1" -> selectionSort.selectionSort(listsCreator.users, compareUserByName.UserComparator);
                case "2" -> selectionSort.selectionSort(listsCreator.users, compareUserByPassword.UserComparator);
                case "3" -> selectionSort.selectionSort(listsCreator.users, compareUserByMail.UserComparator);
            }
        }
        if (type.equals("3")) {
            switch (param) {
                case "1" -> selectionSort.selectionSort(listsCreator.students, compareStudentByGroup.StudentParam1Comparator);
                case "2" -> selectionSort.selectionSort(listsCreator.students, compareStudentByGpa.StudentParam1Comparator);
                case "3" -> selectionSort.selectionSort(listsCreator.students, compareStudentByMatriculationNumber.StudentParam1Comparator);
            }
        }
    }

    @Override
    public String act(Map<String, String> params) {
        sort(params);
        return "Коллекция отсортирована";
    }
}
