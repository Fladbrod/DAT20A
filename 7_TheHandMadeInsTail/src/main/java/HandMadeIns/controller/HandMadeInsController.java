package HandMadeIns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandMadeInsController {

    @GetMapping("/handsMadeIn")
    public String handsMadeIn() {
        return "This is about HandMadeInsTail, the show on HBO";
    }
}
