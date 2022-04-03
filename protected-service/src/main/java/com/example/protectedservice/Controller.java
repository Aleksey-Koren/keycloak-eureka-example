package com.example.protectedservice;

import com.nimbusds.jose.proc.SecurityContext;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {


    @GetMapping("/info")
    @PreAuthorize("hasRole('FOR_SERVICE')")
    public String protectedEndpoint() {
        return "There is some info";
    }
}