package com.epam.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/print")
public class RestController {
    @GetMapping
    public String print()
    {

        System.out.println("hello sreeja");
        return "hii sreeja";
    }

}
