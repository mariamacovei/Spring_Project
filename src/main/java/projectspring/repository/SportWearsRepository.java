package projectspring.repository;

import java.util.ArrayList;
import java.util.List;

public class SportWearsRepository {
    private List<String> sportWears = new ArrayList<>();

    public SportWearsRepository() {
        sportWears.add("manusi");
        sportWears.add("Sac de box");
        sportWears.add("incaltari");
        sportWears.add("haine");
    }

    public List<String> getSportWears() {
        return sportWears;
    }

    public void addWears(String nameWear) {
        sportWears.add(nameWear);
    }

    public void delType(String name) {
        sportWears.remove(name);
    }

}