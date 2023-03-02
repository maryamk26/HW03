public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    public void display() {
        System.out.println("IT DOESN'T EXIST");
    }

    @Override
    public void swim() {
        System.out.println("NOTHING IS HERE(((");
    }
}