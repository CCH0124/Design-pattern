package proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDAO target = new TeacherDAO();
        ITeacherDAO proxy = (ITeacherDAO)new ProxyFactory(target).getProxyInstance();
        proxy.teach();
        proxy.sayHello("Itachi");
    }
}