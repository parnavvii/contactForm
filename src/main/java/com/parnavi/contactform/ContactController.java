package com.parnavi.contactform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping("/contact")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        repository.save(contact);

        return "Contact saved successfully!";
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}