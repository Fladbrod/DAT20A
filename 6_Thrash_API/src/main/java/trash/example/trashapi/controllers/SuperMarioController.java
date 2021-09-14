package trash.example.trashapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuperMarioController {

    @GetMapping("/supermario/character")
    public String Character() {
        return "Marrio";
    }
}
