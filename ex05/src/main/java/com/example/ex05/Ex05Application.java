package com.example.ex05;

import com.example.ex05.computer.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.stream.Stream;

@SpringBootApplication(scanBasePackages = "com.example")
public class Ex05Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Ex05Application.class, args);
        System.out.println(context.getBeanDefinitionCount());
        String [] beanNames = context.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);

        Computer computer1 = context.getBean(Computer.class);
        Computer computer2 = context.getBean(Computer.class);
        Computer computer3 = context.getBean(Computer.class);

        System.out.println(computer1 == computer2);
        System.out.println(computer1 == computer3);
    }
}
