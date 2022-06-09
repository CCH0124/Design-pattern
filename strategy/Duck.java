package strategy;

public abstract class Duck  {

    /**
     * 不需要知道實際的物件型態是什麼
     * 在執行期間，每個具體 Duck 物件會將特定的行為指派給那些變數
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * 動態改變行為
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 動態改變行為
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        // 將行為委託給 quackBehavior 所參考的物件
        quackBehavior.quack();
    }
}
