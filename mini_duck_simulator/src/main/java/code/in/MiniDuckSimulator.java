package code.in;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("---");
        Duck mallardDuck = new MallardDuck("Mallard Duck");
        Duck rubberDuck = new RubberDuck("Rubber Duck");
        Duck modelDuck = new ModelDuck("Model Duck");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}