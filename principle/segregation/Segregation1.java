package principle.segregation;
interface Interface1 {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements Interface1 {

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

    @Override
    public void method4() {
        // TODO Auto-generated method stub
        System.out.println("B Implement method4");
    }

    @Override
    public void method5() {
        // TODO Auto-generated method stub
        System.out.println("B Implement method5");
    }
    
}
class D implements Interface1 {

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("D Implement method1");
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("D Implement method2");
    }

    @Override
    public void method3() {
        // TODO Auto-generated method stub
        System.out.println("D Implement method3");
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
    public void depend2(Interface1 i) {
        i.method2();
    }
    public void depend3(Interface1 i) {
        i.method3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.method1();
    }
    public void depend4(Interface1 i) {
        i.method4();
    }
    public void depend5(Interface1 i) {
        i.method5();
    }
}

public class Segregation1 {
    public static void main(String[] args) {
        
    }
}