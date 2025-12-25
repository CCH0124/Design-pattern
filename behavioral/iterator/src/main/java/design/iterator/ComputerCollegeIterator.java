package design.iterator;

import java.util.Iterator;
import java.util.Objects;

public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0;

    

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position < departments.length && Objects.nonNull(departments[position])) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Department department =  departments[position];
        ++position;
        return department;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }
    
}
