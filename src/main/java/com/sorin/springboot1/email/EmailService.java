package com.sorin.springboot1.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {

    private static Logger LOG = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private EmailDao emailDao;

    public List<Email> getAll() {
        LOG.info("All emails are requested...");
        List<Email> result = new ArrayList<>();
        emailDao.findAll().iterator().forEachRemaining(result::add);
        return result;
    }
}
