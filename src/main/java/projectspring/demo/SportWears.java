package projectspring.demo;

import java.util.ArrayList;
import java.util.List;

public class SportWears {
    List<String> sportWears = new ArrayList<>();

    public SportWears() {
        sportWears.add("manusi");
        sportWears.add("Sac de box");
        sportWears.add("incaltari");
        sportWears.add("haine");
    }

    List<String> getSportWears() {
        return sportWears;
    }

    public void addWears(String nameWear) {
        sportWears.add(nameWear);

    }



}