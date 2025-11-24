package code.in;

public class MallardDuck extends Duck{
    public MallardDuck(String name) {
        System.out.println("Constructor of " + name + " called");
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        display();
        swim();
        flyBehavior.fly();
        quackBehavior.quack();
        System.out.println("---");
    }
}
