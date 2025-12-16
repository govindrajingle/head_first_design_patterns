package code.in;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void prepare() {

    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
