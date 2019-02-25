package com.eolicoproject.eolico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class EolicoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EolicoApplication.class, args);
    }

    @RequestMapping("/home")
    public String hello() {
        return "Home!";
    }

}
