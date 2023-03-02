public class ReadheadDuck extends Duck {

    public ReadheadDuck() {quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    public void display() {
        System.out.println("OHHH! RED-HEADDD DUCKKKK!!!");
    }
    @Override
    public void swim() {
        System.out.println("LOOK!! IT'S SWIMMINGGGGG");
    }
}