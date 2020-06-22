package prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProroType deepProroType =  new DeepProroType();
        deepProroType.name = "Naruto";
        deepProroType.deepCloneableTarget = new DeepCloneableTarget("Itachi", "Itachi Class");

        // DeepProroType deepProroType2 = (DeepProroType)deepProroType.clone();

        // System.out.println(deepProroType.deepCloneableTarget.hashCode());
        // System.out.println(deepProroType2.deepCloneableTarget.hashCode());

        // method2 
        DeepProroType deepProroType2 = (DeepProroType)deepProroType.deepClone();

        System.out.println(deepProroType.deepCloneableTarget.hashCode());
        System.out.println(deepProroType2.deepCloneableTarget.hashCode());
    }
}