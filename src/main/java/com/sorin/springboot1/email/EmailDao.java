package com.sorin.springboot1.email;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailDao extends CrudRepository<Email, Long> {


}
