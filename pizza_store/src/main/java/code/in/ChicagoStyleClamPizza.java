package code.in;


public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    void prepare() {

    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}