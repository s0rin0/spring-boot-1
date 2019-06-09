package com.sorin.springboot1.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest()
public class EmailDaoTest {


    @Autowired
    private EmailDao emailDao;

    @Test
    public void testAddAndGet() {
        Email e = new Email();
        e.setFromAddress("f");
        e.setSubject("S");

        emailDao.save(e);

        Iterator<Email> allEmails = emailDao.findAll().iterator();

        assertTrue(allEmails.hasNext());
        Email saved = allEmails.next();
        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertEquals("f", saved.getFromAddress());
        assertFalse(allEmails.hasNext());

    }

}
