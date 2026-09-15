import java.util.Optional;

public class Ex03 {
    static void main() {

        Optional.ofNullable(getExamScore("수학"));
    }

    private static int getExamScore(String subject) {
        if(subject.equals(("수학"))) {
            return 100;
        }else
            return 20;
    }
}
