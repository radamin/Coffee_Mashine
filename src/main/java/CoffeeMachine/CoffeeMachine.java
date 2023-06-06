package CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class CoffeeMachine {
    private List<Coffee> coffeeMachine = new ArrayList<>();
    private double cash = 0;
    private int sugarPortion;
    private double sugarPrice;

    public int getSugarPortion() {
        return sugarPortion;
    }

    public void setSugarPortion(int sugarPortion) {
        this.sugarPortion = sugarPortion;
    }

    public void setSugarPrice(int sugarPrice) {
        this.sugarPrice = sugarPrice;
    }

    public double getCash() {
        return cash;
    }

    public List<Coffee> getCoffeeMachine() {
        return coffeeMachine;
    }

    public CoffeeMachine addCoffee(Coffee prod) {
        coffeeMachine.add(prod);
        return this;
    }

    public Coffee findCoffee(String name) {
        for (Coffee coffee : coffeeMachine) {
            if (name.equals(coffee.getCoffeeName())) {
                return coffee;
            }
        }
        return null;
    }

    public void getСheck(Coffee coffee, int howMach, double money, int sugar) {
        System.out.println("++++++++++++++++++++++++++++++++");
        String resultCoffee = String.format("Продано: %s %d * %.2f = %.2f руб.\n", coffee.getCoffeeName(), howMach,
                coffee.getCoffeePrice(), (coffee.getCoffeePrice() * howMach));
        String resultSugar = String.format("Порций сахара:\t %d * %.2f = %.2f руб.\n", sugar, sugarPrice, (sugar * sugarPrice));
        String putMoney = ("Внесено: " + money + " руб.\n");
        String change = ("Ваша сдача: " + getChange(money, howMach, coffee, sugar).toString() + " руб. ");
        System.out.println(resultCoffee + resultSugar + putMoney + change);
        System.out.println("++++++++++++++++++++++++++++++\n");
    }

    public Coffee saleCoffee(String name, int howMach, double money, int sugar) {
        Coffee founded = findCoffee(name);
        if (getChange(money, howMach, founded, sugar) == null) {
            System.out.println("Не удалось купить " + name + ", недостаточно средств!\n");
        } else {
            if (sugarPortion >= sugar) {
                if (founded != null) {
                    cash = cash + founded.getCoffeePrice() * howMach + sugar * sugarPrice;
                    coffeeMachine.remove(founded);
                    sugarPortion = sugarPortion - sugar;
                    getСheck(founded, howMach, money, sugar);
                    return founded;
                }
            } else {
                System.out.println("В аппарате осталось " + sugarPortion + " порций сахара.\n");
            }
        }

        return null;

    }

    public Double getChange(double money, int howMach, Coffee coffee, double sugar) {
        if (money >= coffee.getCoffeePrice() + sugar) {
            double change;
            change = money - coffee.getCoffeePrice() * howMach - sugar * sugarPrice;
            return change;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        builder.append("Сальдо: ").append(cash).append(" руб.").append("\n");
        for (Coffee coffee : coffeeMachine) {
            builder.append(i).append(") ").append(coffee);
            i++;
        }
        return builder.toString();
    }
}