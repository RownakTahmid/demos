package com.rownak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
f
@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(Main.class, args);
    }
    @GetMapping("/gra")
    public GreetResponse gra(){
        return new GreetResponse("label");
    }
    @GetMapping("/go")
    public Run go(){
        return new Run(34, "Loki", List.of("nike","nB"), new Age(23) );
    }
    record Age(int age){

    }
    record Run(int speed, String runnerName, List<String> listofShoes, Age age){

    }
    record GreetResponse(String grt){}
//    public void(){
//        ArrayList <>
//    }
}
