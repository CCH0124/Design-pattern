package proxy.staticproxy;

public class TeacherDAOProxy implements ITeacherDAO {
    private ITeacherDAO target;
    
    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println("Proxy....");
        target.teach();
        System.out.println("提交....");
    }

    /**
     * @param target
     */
    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }
    
}