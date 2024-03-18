package com.codeadiction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemo4Application.class, args);
    }

    @GetMapping("/welcome")
    public String msg(){
        return "This Docker demo create a docker image by using Google jib ";
    }

}
