public class RubberDuck extends Duck {

    @Override
    public void swim() {
        System.out.println("THE DUCK FLOATS");
    }

    @Override
    public void quack() {
        System.out.println("SQUEAK SQUEAKKKK");
    }

    @Override
    public void fly() {
        System.out.println("THE DUCK DOESN'T FLY");
    }

    @Override
    public void display() {
        System.out.println("IT'S A RUBBER DUCK");
    }
}


