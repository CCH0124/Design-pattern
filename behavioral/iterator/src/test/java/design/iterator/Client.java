package design.iterator;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void testIterator() {
        List<College> list = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        list.add(computerCollege);
        list.add(infoCollege);

        OutputImpl o =  new OutputImpl(list);
        o.printCollege();
    }
}
