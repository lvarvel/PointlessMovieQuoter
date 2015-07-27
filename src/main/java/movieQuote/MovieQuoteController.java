package movieQuote;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MovieQuoteController {

    @RequestMapping("/")
    public String index() {
        return "I don't get it! Let's make it a bug!";
    }

}