import java.util.Optional;

public class Ex02 {

    static void main() {
        //Optinal 안에 hello 담아서 꺼내서 출력하기
        Optional<String> strHello = Optional.of("Hello");
        System.out.println(strHello.get());

        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElse("빈값"));

        System.out.println(Optional.ofNullable(null).orElse("기본 값"));
    }
}
