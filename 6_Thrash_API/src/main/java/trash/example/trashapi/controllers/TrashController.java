package trash.example.trashapi.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class TrashController {


    @GetMapping("/")
    public String frontpage() {
        return "Hej med dig";
    }

    @GetMapping("/clock")
    public Date clock() {
        return new Date();
    }

    @GetMapping("/pokemon")
    public String pokemon() {
        ArrayList<String> pokemon = new ArrayList<>();
        pokemon.add("Sverri");
        pokemon.add("PP");
        pokemon.add("PC");

        return String.valueOf(pokemon);
    }

    /* @GetMapping("/clock")
    public String clock() {
        return LocalDateTime.now().toString();
    }*/
}

