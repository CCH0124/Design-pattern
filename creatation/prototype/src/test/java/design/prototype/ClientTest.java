package design.prototype;

import design.prototype.deepclone.DeepCloneableTarget;
import design.prototype.deepclone.DeepProroType;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    void deepCloneTest() throws CloneNotSupportedException {
        DeepProroType deepProroType =  new DeepProroType();
        deepProroType.name = "Naruto";
        deepProroType.deepCloneableTarget = new DeepCloneableTarget("Itachi", "Itachi Class");

         DeepProroType deepProroType2 = (DeepProroType)deepProroType.clone();

         System.out.println(deepProroType.deepCloneableTarget.hashCode());
         System.out.println(deepProroType2.deepCloneableTarget.hashCode());
         DeepProroType deepProroType3 = (DeepProroType)deepProroType.deepClone();

         System.out.println(deepProroType.deepCloneableTarget.hashCode());
         System.out.println(deepProroType3.deepCloneableTarget.hashCode());
    }
}
