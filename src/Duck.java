
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehaviour fly) {
        flyBehaviour = fly;
    }

    public void setQuackBehavior(QuackBehaviour quack) {
        quackBehaviour = quack;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    abstract void display();

    public abstract void swim();
}