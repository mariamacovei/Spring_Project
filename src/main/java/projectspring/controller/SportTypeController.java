package projectspring.controller;

import org.springframework.web.bind.annotation.*;
import projectspring.repository.SportTypeRepository;

import java.util.List;

@RestController
@RequestMapping("/sport")

public class SportTypeController {
    private SportTypeRepository sportType1 = new SportTypeRepository();

    @GetMapping("/type")
    public List<String> typeList() {
        return sportType1.getType();
    }

    @PutMapping("/addtype/{name}")
    public void addTypes(@PathVariable("name") String name) {
        sportType1.addTypes(name);
    }

    @DeleteMapping("/delType/{name}")
    public void delType(@PathVariable("name") String name) {
        sportType1.delType(name);
    }

}
