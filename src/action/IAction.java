package action;

import generator.Generator;

import java.util.List;
import java.util.Map;

public interface IAction {
    String act(Map<String, String> params);
}
