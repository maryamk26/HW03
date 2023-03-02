public class Main {
    public static void main(String[] args) {
        MallardDuck MALLDUCK = new MallardDuck();
        MALLDUCK.display();
        MALLDUCK.performFly();
        MALLDUCK.performQuack();
        MALLDUCK.swim();
        ReadheadDuck RHDUCK = new ReadheadDuck();
        RHDUCK.display();
        RHDUCK.performFly();
        RHDUCK.performQuack();
        RHDUCK.swim();
        RubberDuck RUBBDUCK = new RubberDuck();
        RUBBDUCK.display();
        RUBBDUCK.performFly();
        RUBBDUCK.performQuack();
        RUBBDUCK.swim();
        DecoyDuck DECCOYDUCK = new DecoyDuck();
        DECCOYDUCK.display();
        DECCOYDUCK.performFly();
        DECCOYDUCK.performQuack();
        DECCOYDUCK.swim();
        DECCOYDUCK.setFlyBehavior(new FlyWithWings());
        DECCOYDUCK.setQuackBehavior(new Squeak());
        DECCOYDUCK.performFly();
        DECCOYDUCK.performQuack();
    }
}