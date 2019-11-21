package projectspring.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/sport")
public class Sport {
    SportType  sportType1 = new SportType();
    SportWears sporrtWears = new SportWears();

    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }

    @GetMapping("/wears")
    public List<String> wearsList() {
        return sporrtWears.getSportWears();
    }
    @GetMapping("/type")
    public List<String> typeList() {
        return sportType1.getType();
    }



    @PostMapping("/addWear/{name}")
    public void addwear(@PathVariable("name") String name) {
        sporrtWears.addWears(name);


    }

    @PutMapping("/addtype/{name}")
    public void addWear(@PathVariable("name") String name) {
        sportType1.addTypes(name);
    }
    @DeleteMapping("/delType/{name}")
    public  void delType(@PathVariable("name")String name){
        sportType1.delType(name);
    }

}

