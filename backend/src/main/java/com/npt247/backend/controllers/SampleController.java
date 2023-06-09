package com.npt247.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {
    @GetMapping("/Title")
    public String getTitle(){
        return "<title>Hello from Back-end</title>";
    }
}
