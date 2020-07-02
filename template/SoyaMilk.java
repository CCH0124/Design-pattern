package template;

public abstract class SoyaMilk {
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    public void select(){
        System.out.println("Step 1");
    }

    abstract void addCondiments();

    public void soak(){
        System.out.println("Step 3");
    }
    public void beat(){
        System.out.println("Step 4");
    }
}