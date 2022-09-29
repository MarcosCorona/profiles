package com.bosonit.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@Profile("!prod")
public class OtherProfilesController {
    @GetMapping("/hl")
    public String helloEveryone(){
        return "Hello everyone that is not prod!";
    }
}
