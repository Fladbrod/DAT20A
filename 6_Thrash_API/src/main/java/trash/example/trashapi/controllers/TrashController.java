package trash.example.trashapi.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TrashController {


    List<String> sins = new ArrayList<>() {{
        add("Gluttony");
        add("Shyness");
        add("Another one");
        add("Another one");
        add("Another one");
        add("Another one");
        add("Another one");
        add("The last one");
    }};


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
        try {
            return sins.get(number);
        } catch (Exception e){
            return "Hej";
        }
    }

    @GetMapping("")
    public List getDeadlySins() {


        return null;
    }


    @GetMapping("/trash")
    public String getFoos(@RequestParam String trash, @RequestParam(required = false) String otherTrash) {
        return trash + " " + otherTrash;
    }

    @PostMapping("/rubbishbin")
    public String throwOutRubbish(@RequestBody String rubbish) {
        System.out.println(rubbish);
        return "Everything went bad";
    }
}