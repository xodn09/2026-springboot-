
interface BB{
    String doA(int a);
}
class AAAA{}
public class Ex04 {
    public static void method1(BB bb, AAAA aaaa){

    }
    public static void main(String[] args){
        method1(
                (num) -> String.valueOf(num),
                new AAAA()
        );
    }
}
