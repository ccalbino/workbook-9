package com.pluralsight.NorthwindTradersAPI.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String Index(
            @RequestParam(required = false) String country)
    {
        if (country != null && !country.isEmpty()){
            return "<h1> You live in " + country + "! </h1>"   ;
        } else {
            return "<h1> HELLO WORLD </h1>";
        }
    }
}
