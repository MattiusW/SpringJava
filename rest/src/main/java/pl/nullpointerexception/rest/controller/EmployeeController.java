package pl.nullpointerexception.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/test")
    public static String test(){
        return "Samiec pozamiatał wczoraj haha xD";
    }
}
