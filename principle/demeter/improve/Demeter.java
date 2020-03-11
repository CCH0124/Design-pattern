package principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String id;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}

class CollegeEmployee {
    private String id;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院 EMP id= "+i);
            list.add(emp);
        }
        return list;
    }
    public void printEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("分公司員工");
        for(CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            Employee emp = new Employee();
            emp.setId("School EMP id= "+i);
            list.add(emp);
        }
        return list;
    }
    public void printAllEmployee(CollegeManager sub){
        // 封裝至 CollegeManager
        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("學校員工");
        for(Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
public class Demeter {
    public static void main(String[] args) {
        SchoolManager sm = new SchoolManager();
        sm.printAllEmployee(new CollegeManager());
    }
}