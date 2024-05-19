package com.dmdev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {

    public static void main(String[] args) {

        var context1 = SpringApplication.run(ApplicationRunner.class, args);
        System.out.println(context1.getBeanDefinitionCount());
    }
}
