import java.util.function.*;
import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("삭제점...");
        list.forEach(num -> System.out.println(num));
        list.replaceAll(num -> num * num);
        System.out.println("삭제후...");
        list.forEach(num -> System.out.println(num));
    }
}