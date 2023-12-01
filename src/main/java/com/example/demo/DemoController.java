package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

 @RequestMapping("/")
 String hello() {
     return "Hello World, Spring Boot!";
 }

}
