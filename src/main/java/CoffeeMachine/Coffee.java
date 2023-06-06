package CoffeeMachine;

public class Coffee {
    private final String coffeeName;
    private final int coffeeVolume;
    private final double coffeePrice;
    private final int coffeeTemperature;

    public String getCoffeeName() {
        return coffeeName;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    @Override
    public String toString() {
        return String.format("%s, объём: %d мл, температура: %d ℃, цена: %.2f руб\n"
                , coffeeName, coffeeVolume, coffeeTemperature, coffeePrice);
    }

    public Coffee(String coffeeName, int coffeeVolume, double coffeePrice, int coffeeTemperature) {
        this.coffeeName = coffeeName;
        this.coffeeVolume = coffeeVolume;
        this.coffeeTemperature = coffeeTemperature;
        this.coffeePrice = coffeePrice;
    }
}