package trash.example.trashapi.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class TrashController {


    List<String> pokemon = new ArrayList<>() {{
        add("SVERRIGE");
        add("PP");
        add("PC");
    }};

    @GetMapping("/")
    public String frontpage() {
        return "Hej med dig";
    }

    @GetMapping("/clock")
    public Date clock() {
        return new Date();
    }
/* Kan vi ikke lide. hver gang i bruger går ind på endpointet laves en ny liste.
    @GetMapping("/pokemon")
    public String pokemon() {
        ArrayList<String> pokemon = new ArrayList<>();
        pokemon.add("Sverri");
        pokemon.add("PP");
        pokemon.add("PC");

        return String.valueOf(pokemon);
    }*/

    @GetMapping("/pokemon")
    public List pokemon() {
        return pokemon;
    }

    /* @GetMapping("/clock")
    public String clock() {
        return LocalDateTime.now().toString();
    }*/

    @GetMapping("/deadly/{number}")
    public String deadlySins(@PathVariable int number) {
        switch (number) {
            case 1:
                return "Sloth";
            case 2:
                return "Gluttonous";
            case 3:
                return "Fire";
            case 4:
                return "Another one";
            case 5:
                return "Infidelity";
            case 6:
                return "One more";
            case 7:
                return "The last one, and the baddest";
        }
        return "";
    }
    @GetMapping("")
    public String getDeadlySins() {


        return null;
    }

}


