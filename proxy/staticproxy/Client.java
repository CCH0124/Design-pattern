package proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();

        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacherDAO);
        teacherDAOProxy.teach();
    }
}