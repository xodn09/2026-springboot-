package com.example.ex05.hello;

import com.example.ex05.computer.Computer;
import com.example.ex05.computer.Macbook;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private Computer computer;

    private final Macbook macbook;

    public HelloController(Macbook macbook) {
        this.macbook = macbook;
    }

    @GetMapping("macbook")
    public String macbook() {
        computer.turn0n();
        return "Macbook";
    }

    @GetMapping("computer")
    public String computer() {
        computer.turn0n();
        return "computer";
    }

    @GetMapping("api/hello")
    @Operation(summary = "이름을 보내시면 인사합니다.", description = "설명하고 싶은거 적는거")
    public Map<String, Object> hello(@RequestParam(defaultValue = "익명") String name) {
        System.out.println("hello " + name);
        return Map.of("message", "Hello World!");
    }

    @PostMapping("api/data")
    public Map<String, Object> data(@RequestBody Map<String, Object> body) {
        System.out.println("data " + body);
        return Map.of("message", "api/data");
    }
}
