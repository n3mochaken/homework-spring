package pro.sky.homeworkspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeworkspring.service.CounterService;

@RestController

public class Calculator {

    private final CounterService counterService;
    public Calculator(CounterService counterService){
        this.counterService = counterService;
    }
    @GetMapping
    public String showHello(){
        return "Hello";
    }
    @GetMapping("/counter")
    public String showCounter(){
        return "кол-во " + counterService.getRequestCount();
    }
}

