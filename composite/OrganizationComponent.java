package composite;

public abstract class OrganizationComponent {
    private String name;
    private String des;    

    protected void add(OrganizationComponent organizationComponent) {
        // 默認實現，Left 需要
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent) {
        // 默認實現，Left 需要
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    // 子類都需要實現
    protected abstract void print();

}