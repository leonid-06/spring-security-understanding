package com.leonid.springsecurityunderstanding.part8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String get() {
        return "hello";
    }

    @PostMapping
    public String post() {
        return "redirect:/hello";
    }


}
