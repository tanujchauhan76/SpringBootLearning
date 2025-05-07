package com.codewithtanuj.Codingexercise;


import org.springframework.web.bind.annotation.*;

@RestController
public class MyWebsiteController {

    @GetMapping("/homepage")
    public String openHomePage() {
        return "Hello welcome to homepage: test :";
    }

    @PostMapping("/addUser")
    public String adduser( @RequestBody User u1) {
        return "ID:" + u1.getID() + " Name: " + u1.getName();
    }

    @PutMapping{}
}
