package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();
    public College(String name, String des) {
        super(name, des);
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        organizationComponents.add(organizationComponent);
    }
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    @Override
    public String getDes() {
        // TODO Auto-generated method stub
        return super.getDes();
    }
    @Override
    protected void print() {
        // TODO Auto-generated method stub
        System.out.println(getName());
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }

    }
    
}