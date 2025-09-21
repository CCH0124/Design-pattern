package design.behavioral.duck;

import design.behavioral.behavior.FlyBehavior;
import design.behavioral.behavior.QuackBehavior;

public abstract class Duck {
	// 執行期間決定
    FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	abstract protected void display();

	public String performFly() {
		return flyBehavior.fly();
	}

	public String performQuack() {
		return quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
