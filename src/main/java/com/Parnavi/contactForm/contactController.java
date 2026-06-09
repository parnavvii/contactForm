package com.Parnavi.contactForm;

import org.springframework.web.bind.annotation.*;

@RestController
public class contactController {

    @PostMapping("/contact")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        return "Form Submitted Successfully!";
    }
}   