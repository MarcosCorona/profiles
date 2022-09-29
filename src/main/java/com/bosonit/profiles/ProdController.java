package com.bosonit.profiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
@Profile("prod")
public class ProdController{

    @GetMapping("/hprod")
    public String helloDev(){
        return "Hello prod!";
    }

}
