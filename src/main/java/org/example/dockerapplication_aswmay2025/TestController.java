package org.example.dockerapplication_aswmay2025;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String returnWelcomeMessage() {
        return "Hello World";
    }
}
