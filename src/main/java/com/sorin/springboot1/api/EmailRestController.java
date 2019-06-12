package com.sorin.springboot1.api;

import com.sorin.springboot1.email.Email;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/email")
@Api(value = "Spam Email Inspector", tags = "Email Rest Controller")
@SwaggerDefinition(tags = {
        @Tag(name = "Email Rest Controller", description = "Api for reading emails data")
})
public interface EmailRestController {

    @GetMapping(path = "/all")
    List<Email> getAll();

}
