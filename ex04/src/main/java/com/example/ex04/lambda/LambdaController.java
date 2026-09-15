package com.example.ex04.lambda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RestController
public class LambdaController {

    @GetMapping("lambda")
    public String lambda() {
        return "lambda";
    }

    @GetMapping("streammake")
    public String streammake() {
        String[] strings = new String[]{"aa", "bb", "cc", "eee", "kkk", "oo"};
        Stream<String> stream = Stream.of(strings);
        long count = stream.filter(s -> s.length() == 2)
                .sorted()
                .peek(System.out::println)
                .count();
        return "streammake count = " + count;
    }

    @GetMapping("streamMap")
    public String streamMap() {
        String[] arr = {"aa", "bb", "cc", "ddd", "eee"};
        Stream<String> stream = Stream.of(arr);
        List<Integer> list = stream
                .map((str) -> str.length())
                .toList();
        System.out.println(list);
        return "streamMap count = " + list;
    }

    @GetMapping("calculate")
    public Map<String, Integer> calculate(@RequestParam int a, @RequestParam int b) {
        System.out.println("a : " + a + " b : " + b);
        Calculate add = (a1, b1) -> a1 + b1;
        Calculate sub = (a1, b1) -> a1 - b1;
        return Map.of("a", a,
                "b", b,
                "a+b", add.calcu(a, b),
                "a-b", sub.calcu(a, b));
    }

    @GetMapping("even")
    public Map<String, Integer> even(@RequestParam int from, @RequestParam int to) {
        long count = IntStream.range(from, to)
                .filter(num -> num % 2 == 0)
                .sorted()
                .peek(System.out::println)
                .count();
        return Map.of("count", (int)count);
    }
}

@FunctionalInterface
interface Calculate {
    int calcu(int a, int b);
}