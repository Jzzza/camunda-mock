package ru.dmartyanov.application;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableProcessApplication("ru.dmartyanov.ProcessApplication")
@ComponentScan(basePackages = {"ru.dmartyanov"})
public class ProcessApplication {
    public static void main(String... args) {
        SpringApplication.run(ProcessApplication.class, args);
    }
}
