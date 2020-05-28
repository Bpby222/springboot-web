package com.bpby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bpby.controller")
public class DocumentSiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(DocumentSiteApplication.class);
    }
}
