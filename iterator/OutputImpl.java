package iterator;

import java.util.Iterator;
import java.util.List;


public class OutputImpl {
    List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege() {
        Iterator<College> iterator = colleges.iterator();
        while(iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator) {
        while(iterator.hasNext()){
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }
}
