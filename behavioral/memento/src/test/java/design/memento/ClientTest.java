package design.memento;

import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void clientTest() {
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
