package design.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("JAVA", "JAVA");
        addDepartment("PHP", "PHP");
        addDepartment("Javascript", "Javascript");
        addDepartment("Golang", "Golang");
        addDepartment("swift", "swift");
    }
    @Override
    public String getName() {
        return "Computer College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
    
}
