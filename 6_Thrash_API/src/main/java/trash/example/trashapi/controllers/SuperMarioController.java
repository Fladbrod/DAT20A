package trash.example.trashapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import trash.example.trashapi.model.SuperMarioCharacter;

@Controller
public class SuperMarioController {

    @GetMapping("/supermario/character")
    public SuperMarioCharacter getCharacter(SuperMarioCharacter superMarioCharacter) {
        return superMarioCharacter;
    }
}
