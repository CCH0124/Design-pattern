package design.proxy;


import design.proxy.dynamic.ITeacherDAO;
import design.proxy.dynamic.ProxyFactory;
import design.proxy.dynamic.TeacherDAO;
import design.proxy.remote.RemoteServiceProxy;
import design.proxy.virtual.VirtualProxy;
import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    public void testProxyImage() {
        Image image = new ProxyImage("test_image.jpg");
        // Image will be loaded from disk
        image.display();
        // Image will not be loaded from disk, as it is already loaded
        image.display();
    }

    @Test
    public void virtual() {
        Service virtualProxy = new VirtualProxy();
        System.out.println("First：");
        virtualProxy.request();

        System.out.println("Second：");
        virtualProxy.request();
    }

    @Test
    public void remote() {
        Service remoteProxy = new RemoteServiceProxy("192.168.1.100");
        remoteProxy.request();
    }

    @Test
    public void dynamic() {
        ITeacherDAO target = new TeacherDAO();
        ITeacherDAO proxy = (ITeacherDAO)new ProxyFactory(target).getProxyInstance();
        proxy.teach();
        proxy.sayHello("Itachi");
    }
}
