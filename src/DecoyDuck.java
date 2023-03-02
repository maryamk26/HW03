public class DecoyDuck extends Duck{

    @Override
    public void swim() {
        System.out.println("IT DOESN'T EXIST");
    }

    @Override
    public void display() {
        System.out.println("IT DOESN'T EXISTTT");
    }
}
