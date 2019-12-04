package projectspring.repository;

import java.util.ArrayList;
import java.util.List;

public class SportTypeRepository {
    private List<String> type = new ArrayList<>();

    public SportTypeRepository() {
        type.add("fotbal");
        type.add("box");
        type.add("volei");
        type.add("baschet");
        type.add("handball");
    }

    public List<String> getType() {
        return type;
    }

    public void addTypes(String name) {
        type.add(name);
    }

    public void delType(String name) {
        type.remove(name);
    }
}
