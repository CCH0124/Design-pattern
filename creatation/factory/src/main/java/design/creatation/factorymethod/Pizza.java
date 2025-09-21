package design.creatation.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
		System.out.printf("Prepare %s \n", name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		toppings.forEach( t -> System.out.println("   " + t));
	}

    /**
     * 烘焙
     */
    public void bake(){
        System.out.println(name + " baking...");
    }
    /**
     * 切割
     */
    public void cut(){
        System.out.println(name + " cutting...");
    }
    /**
     * 打包
     */
    public void box(){
        System.out.println(name + " boxing...");
    }
}
