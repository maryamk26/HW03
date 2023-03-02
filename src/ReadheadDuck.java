public class ReadheadDuck extends Duck implements Flyable,Quackable{

    @Override
    public void swim() {
        System.out.println("THE DUCK SWIMS");
    }

    @Override
    public void quack() {
        System.out.println("QUACK QUACKKK");
    }

    @Override
    public void fly() {
        System.out.println("THE DUCK FLIES");
    }

    @Override
    public void display() {
        System.out.println("IT'S A READ-HEAD DUCK");
    }
}




