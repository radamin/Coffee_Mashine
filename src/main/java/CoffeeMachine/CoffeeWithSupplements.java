package CoffeeMachine;

public class CoffeeWithSupplements extends Coffee {
    private final String supplement;


    public CoffeeWithSupplements(String coffeeName, int coffeeVolume, double coffeePrice,
                                 int coffeeTemperature, String supplement) {
        super(coffeeName, coffeeVolume, coffeePrice, coffeeTemperature);
        this.supplement = supplement;
    }

    @Override
    public String toString() {
        return String.format("%s\tДобавка: %s\n", super.toString(), supplement);
    }
}
