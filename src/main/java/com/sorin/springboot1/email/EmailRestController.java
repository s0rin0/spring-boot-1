package com.sorin.springboot1.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/email")
public class EmailRestController {

    private static Logger LOG = LoggerFactory.getLogger(EmailRestController.class);

    @Autowired
    private EmailService emailService;

    @GetMapping(path = "/all")
    public List<Email> getAll() {
        return emailService.getAll();
    }
}
