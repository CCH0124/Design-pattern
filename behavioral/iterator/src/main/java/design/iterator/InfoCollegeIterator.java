package design.iterator;
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
        if (index < departments.size()-1) {
            ++index;
            return true;
        }
        
        return false;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
    
    @Override
    public void remove() {
        
    }
}
