package principle.invervion.improve;
interface IReceiver {
    public String getInfo();
}
class Email implements IReceiver{
    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "Email Message: hello world";
    }
    
}
class Line implements IReceiver {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Line Message: hello";
	}

}
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

public class DependecyInversion2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
        p.receive(new Line());
    }
}