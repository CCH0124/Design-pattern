package principle.liskov;
class A {
    public int func(int num1, int num2){
        return num1 - num2;
    }
}

class B extends A {
    public int func(int a, int b){
        return a + b;
    }
    public int func2(int a, int b){
        return func(a, b)+9;
    }
}
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func(11, 3));
        System.out.println(a.func(1, 8));
        B b = new B();
        // func 不小心重寫父類方法
        System.out.println(b.func(11, 3));
        System.out.println(b.func(1, 8));
        System.out.println(b.func2(11, 3));
    }
}