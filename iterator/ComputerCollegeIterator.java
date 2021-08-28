package iterator;

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
        // TODO Auto-generated method stub
        if (position < departments.length && Objects.nonNull(departments[position])) {
            // System.out.println(position);
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        Department department =  departments[position];
        ++position;
        return department;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }
    
}
