package prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProroType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProroType() {
        super();
    }
    // method 1
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 基本數據類型和String的克隆
        deep = super.clone();
        // 引用類型數據的屬性，進行單獨處理
        DeepProroType deepProroType = (DeepProroType)deep;
        deepProroType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        // TODO Auto-generated method stub
        return deepProroType;
    }

    // method 2
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProroType copyObj = (DeepProroType)ois.readObject();
            return copyObj;
        } catch (Exception e) {
            //TODO: handle exception
            return null;
        } finally{
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}