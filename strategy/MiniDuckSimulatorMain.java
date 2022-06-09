package strategy;

import strategy.impl.FlyRocketPowered;

public class MiniDuckSimulatorMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        // 透過此 set 可以改變鴨子的行為
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
