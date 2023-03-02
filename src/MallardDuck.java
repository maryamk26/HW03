public class MallardDuck extends Duck {

    public MallardDuck() {quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    public void display() {
        System.out.println("OHHH! MALLARDDD DUCKKKK!!!");
    }
    @Override
    public void swim() {
        System.out.println("LOOK!! IT'S SWIMMINGGGGG");
    }
}