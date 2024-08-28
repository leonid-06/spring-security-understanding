//package com.leonid.springsecurityunderstanding.part7.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Controller
//public class HelloController {
//
//    private String globalMessage = "Hello World";
//
//    @GetMapping
//    public String home(Model model) {
//        model.addAttribute("message", globalMessage);
//        return "home.html";
//    }
//
//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute("message", "Hello World!");
//        return "hello.html";
//    }
//
//    @PostMapping("/hello")
//    public String postHello(@RequestBody String message) {
//        globalMessage = message;
//        return "redirect:/";
//    }
//}