
package ru.iu3.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/title")
public class SampleController {

    @GetMapping()
    public String getTitle() {
        return "<title>Hello from Back-end</title>";
    }
}
            