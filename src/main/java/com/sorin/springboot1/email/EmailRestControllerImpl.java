package com.sorin.springboot1.email;

import com.sorin.springboot1.api.EmailRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailRestControllerImpl implements EmailRestController {

    @Autowired
    private EmailService emailService;

    public List<Email> getAll() {
        return emailService.getAll();
    }
}
