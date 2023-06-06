package CoffeeMachine;

public class CoffeeWithMilk extends Coffee {
    private final boolean milkFoam;
    private final String syrup;

    public CoffeeWithMilk (String coffeeName, int coffeeVolume, double coffeePrice, int coffeeTemperature,
                           boolean milkFoam, String syrup)
    {
        super(coffeeName, coffeeVolume, coffeePrice, coffeeTemperature);
        this.milkFoam = milkFoam;
        this.syrup = syrup;
    }

    @Override
    public String toString() {
        if (milkFoam) {
            return String.format("%s\tC молочной пенкой, cироп: %s\n",
                    super.toString(), syrup);
        } else return String.format("%s\tCироп: %s\n",
                super.toString(), syrup);
    }
}
