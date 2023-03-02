public class RubberDuck extends Duck {

    public RubberDuck() {quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    public void display() {
        System.out.println("OHHH! RUBBERRR DUCKKKK!!!");
    }
    @Override
    public void swim() {
        System.out.println("LOOK!! IT'S SWIMMINGGGGG");
    }
}