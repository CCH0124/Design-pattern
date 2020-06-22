package prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Cloneable, Serializable{
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    /**
     * @param cloneName
     * @param cloneClass
     */
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    
}