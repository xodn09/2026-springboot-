import java.util.function.*;
import java.util.*;

@FunctionalInterface
interface Calculate {
    int operate(int a,int b);
}

public class Ex04 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = i -> Integer.parseInt(i);
        Function<String, Integer> f2 = Integer::parseInt;

        List<String> al = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        al.forEach(System.out::println);

        Calculate c1 = (num1, num2) -> num1 + num2;
        Calculate c2 = (num1, num2) -> num1 - num2;

        System.out.println(c1.operate(1, 2));
        System.out.println(c2.operate(2, 1));
    }
}
