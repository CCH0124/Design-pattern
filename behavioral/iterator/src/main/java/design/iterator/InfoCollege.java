package design.iterator;

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
        return "Info College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        list.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(list);
    }
    
}
