package org.forkingaround.adventuretime.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${api-endpoint}/dashboard")
public class DashboardController {

    @GetMapping( path = "")
    public String index() {
        return "Hello Spring Boot!!!";
    }
    
}
