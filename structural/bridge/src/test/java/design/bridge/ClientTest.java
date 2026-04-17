package design.bridge;

import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void ClientTest() {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.close();
        phone.call();

        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.close();
        phone2.call();

        Phone phone3 = new UpRightPhone(new Vivo());
        phone3.open();
        phone3.close();
        phone3.call();
    }
}
