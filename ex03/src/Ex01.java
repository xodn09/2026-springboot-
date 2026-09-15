import java.util.function.*;
import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random()*100);
        System.out.println(s.get());
        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        Consumer<Integer> c = x-> System.out.println(x);
        c.accept(100);
        printList(c, list);

        Function<Integer, String> f = x -> x + "두번 더하면 " + (x + x) + "입니다";
        System.out.println(f.apply(10));

        Predicate<String> pr = s1 -> s1.equals("abcd");
        System.out.println(pr.test("abcd"));
        System.out.println(pr.test("aaaa"));

        BiConsumer<String, String> bic = (x,y) -> {
            System.out.println("이름은 " + x + "입니다.");
            System.out.println("나이는 " + y + "입니다.");
        };
        bic.accept("홍길동", "30");
    }

    private static void printList(Consumer<Integer> c, List<Integer> list) {
        list.forEach(c);
    }

    public static <T> void makeRandomList(Supplier<Integer> s, List<Integer> list){
//        list.add(s.get());list.add(s.get());list.add(s.get());list.add(s.get());
        for (int i = 0; i < 10; i++)
            list.add(s.get());
    }
}
