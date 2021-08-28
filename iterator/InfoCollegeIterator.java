package iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    List<Department> departments;
    int index = -1;
    
    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        if (index < departments.size()-1) {
            ++index;
            return true;
        }
        
        return false;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return departments.get(index);
    }
    
    @Override
    public void remove() {
        
    }
}
