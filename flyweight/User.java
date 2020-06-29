package flyweight;
/**
 * 外部狀態
 */
public class User {
    private String name;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param name
     */
    public User(String name) {
        this.name = name;
    }
    
}