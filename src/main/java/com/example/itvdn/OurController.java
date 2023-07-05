package com.example.itvdn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OurController {
    @RequestMapping(path = "/some", method = RequestMethod.GET)
    public String getSmth(){
        return "hello";
    }
}
