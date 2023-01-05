package eu.hansolo;

import io.micronaut.http.annotation.*;

@Controller("/fancy")
public class FancyController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}