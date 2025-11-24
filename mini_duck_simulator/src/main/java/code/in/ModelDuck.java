package code.in;

public class ModelDuck extends Duck {
    public ModelDuck(String name) {
        System.out.println("---");
        System.out.println("Constructor of " + name + " called");
        display();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
        flyBehavior.fly();
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
}
