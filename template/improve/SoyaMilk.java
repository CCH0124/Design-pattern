package template.improve;

public abstract class SoyaMilk {
    final void make() {
        select();
        if (customWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    public void select() {
        System.out.println("Step 1");
    }

    abstract void addCondiments();

    public void soak() {
        System.out.println("Step 3");
    }

    public void beat() {
        System.out.println("Step 4");
    }

    public boolean customWantCondiments() {
        return true;
    }
}