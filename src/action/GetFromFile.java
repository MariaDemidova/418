package action;

import util.ListsCreator;

import java.util.Map;

public class GetFromFile implements IAction{
    private final ListsCreator listsCreator;

    public GetFromFile(ListsCreator listsCreator) {
        this.listsCreator = listsCreator;
    }

    @Override
    public String act(Map<String, String> params) {
        return "";
    }
}
