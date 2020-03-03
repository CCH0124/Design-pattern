package principle.invervion;
class Email {
    public String getInfo() {
        return "Email Message: hello world";
    }
}
/**
 * 獲取對象是其他通訊軟體，則要新增類別，同時 Person 也要新增相應的接收方法
 * 引入一個接口，表接收者，該 Person 與接口依賴
 */
class Person {
    public void receive(Email mail) {
        System.out.println(mail.getInfo());
    }
}
public class DependecyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}