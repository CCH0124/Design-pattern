package proxy.dynamicproxy;

public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println("授課中.");
    }

    @Override
    public void sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("Hello " + name);
    }
    
}