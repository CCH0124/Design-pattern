package design.proxy;
/**
 * Proxy class that implements the Subject interface. It controls access to the RealSubject and may add additional functionality.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy Loading
        if (realImage == null) {
            System.out.println("Lazy loading...");
            realImage = new RealImage(fileName);
        }
        System.out.println("Proxy: Preparing to call the real object for display...");
        realImage.display();
    }
}
