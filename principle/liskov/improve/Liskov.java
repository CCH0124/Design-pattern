package principle.liskov.improve;
/**
 * 建立更基礎的基類
 */
class Base {

}
class A extends Base {
    public int func(int num1, int num2){
        return num1 - num2;
    }
}

class B extends Base {
    private A a = new A();// 組合
    public int func(int a, int b){
        return a + b;
    }
    public int func2(int a, int b){
        return func(a, b)+9;
    }
    public int func3(int a, int b){
        return this.a.func(a, b);
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
        System.out.println(b.func3(11, 3));
    }
}