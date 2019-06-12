package com.sorin.springboot1.email;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "email")
@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "from_address", nullable = false)
    private String fromAddress;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "received", nullable = false)
    private LocalDateTime received = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getReceived() {
        return received;
    }

    public void setReceived(LocalDateTime received) {
        this.received = received;
    }
}
