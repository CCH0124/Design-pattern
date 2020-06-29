package flyweight;

public class ConcreteWebSite extends WebSite {
    // 共享部分，內部狀態
    private String type = "";
    
    @Override
    public void use(User user) {
        // TODO Auto-generated method stub
        System.out.println("發布形式： " + type + " 使用者為 "+ user.getName());
    }

    /**
     * @param type
     */
    public ConcreteWebSite(String type) {
        this.type = type;
    }
    
}