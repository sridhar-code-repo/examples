package org.example.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * This api can be invoked with credential
 */

@RestController
@RequestMapping(path = "/api")
public class BusinessService {

    public BusinessService() {
        System.out.println("Hello World");
    }

    @GetMapping(path = "/health")
    public String health() {
        return "Ok";
    }

    @GetMapping(path = "/details")
    public String apiDetails() {
        return "This is BussinessService Spring Boot application";
    }
}
