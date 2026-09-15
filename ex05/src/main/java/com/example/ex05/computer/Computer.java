package com.example.ex05.computer;

import org.springframework.context.annotation.Bean;

public class Computer {

    @Bean
    public void turn0n() {
        System.out.println("컴퓨터를 켜요....");
    }
}
