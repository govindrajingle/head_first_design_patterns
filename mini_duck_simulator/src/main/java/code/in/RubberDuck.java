package code.in;

public class RubberDuck extends Duck{
    public RubberDuck(String name) {
        System.out.println("Constructor of " + name + " called");
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        display();
        swim();
        flyBehavior.fly();
        quackBehavior.quack();
        System.out.println("---");
    }
}
