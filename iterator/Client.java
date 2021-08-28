package iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> list = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        list.add(computerCollege);
        list.add(infoCollege);

        OutputImpl o =  new OutputImpl(list);
        o.printCollege();
    }
}
