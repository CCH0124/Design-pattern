package memento;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();

        o.setState("state 1");
        c.add(o.saveStateMemento());

        o.setState("state 2");
        c.add(o.saveStateMemento());

        o.setState("state 3");
        c.add(o.saveStateMemento());

        o.getStateFromMemento(c.get(0));
    }    
}
