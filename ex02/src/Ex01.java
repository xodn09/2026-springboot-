interface DoA{
//    void doSomething();
    void doA();
    default void doB(){
        System.out.println("doB");
    }
    static void doC(){
        System.out.println("doC");
    }
}
public class Ex01 {
    public static void main(String[] args) {
        DoA doA = new DoA(){
            public void doA(){};
        };
        DoA d1 = () -> {};
    }
}