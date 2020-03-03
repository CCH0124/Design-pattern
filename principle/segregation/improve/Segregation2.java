package principle.segregation.improve;
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
    void method3();
}

interface Interface3 {
    void method4();
    void method5();
}

class B implements Interface1, Interface2 {

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("B Implement method1");
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("B Implement method2");
    }

    @Override
    public void method3() {
        // TODO Auto-generated method stub
        System.out.println("B Implement method3");
    }
    
}
class D implements Interface1, Interface3 {

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("D Implement method1");
    }


    @Override
    public void method4() {
        // TODO Auto-generated method stub
        System.out.println("D Implement method4");
    }

    @Override
    public void method5() {
        // TODO Auto-generated method stub
        System.out.println("D Implement method5");
    }
    
}

class A {
    public void depend1(Interface1 i) {
        i.method1();
    }
    public void depend2(Interface2 i) {
        i.method2();
    }
    public void depend3(Interface2 i) {
        i.method3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.method1();
    }
    public void depend4(Interface3 i) {
        i.method4();
    }
    public void depend5(Interface3 i) {
        i.method5();
    }
}

public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        // A class 透過 interface 依賴 B class
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
// B Implement method1
// B Implement method2
// B Implement method3
// D Implement method1
// D Implement method4
// D Implement method5
    }
}