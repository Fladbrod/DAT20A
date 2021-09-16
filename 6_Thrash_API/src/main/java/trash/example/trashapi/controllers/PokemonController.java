package trash.example.trashapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @GetMapping("/pokemon/go")
    public Boolean isGo() {
        return true;
    }
}
