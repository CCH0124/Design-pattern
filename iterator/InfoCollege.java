package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    List<Department> list;


    public InfoCollege() {
        list = new ArrayList<>();
        addDepartment("Security", "Security");
        addDepartment("Network", "Network");
        addDepartment("Server", "Server");
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Info College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        // TODO Auto-generated method stub
        list.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new InfoCollegeIterator(list);
    }
    
}
