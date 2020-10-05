package projectspring.controller;

import org.springframework.web.bind.annotation.*;
import projectspring.repository.SportTypeRepository;
import projectspring.repository.SportWearsRepository;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportWearsController {

     private SportWearsRepository sporrtWears = new SportWearsRepository();

    @GetMapping("/wears")
    public List<String> wearsList() {
        return sporrtWears.getSportWears();
    }


    @PostMapping("/addWear/{name}")
    public void addWears(@PathVariable("name") String name) {
        sporrtWears.addWears(name);

    }
}

