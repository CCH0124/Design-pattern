package iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("JAVA", "JAVA");
        addDepartment("PHP", "PHP");
        addDepartment("Javascript", "Javascript");
        // addDepartment("Golang", "Golang");
        // addDepartment("swift", "swift");
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Computer College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        // TODO Auto-generated method stub
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new ComputerCollegeIterator(departments);
    }
    
}
