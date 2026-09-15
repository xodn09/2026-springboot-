import java.util.function.*;
import java.util.*;

public class Ex03 {
    public static void main(String[] args){
        Function<String, Integer> f = (String s) -> Integer.parseInt(s, 16);
        Function<Integer, String> f2 = (Integer i) -> Integer.toString(i, 2);

        Function<String, String> andThenf = f.andThen(f2);
        System.out.println(andThenf.apply("10"));
    }
}
