public class Ex02 {
    static void main(String[] args){
        AA a1 = () -> 10;
        AA a2 = () -> 20;
        System.out.println(a1);
        System.out.println(a2);
    }
}

interface AA{
    int doA();
}