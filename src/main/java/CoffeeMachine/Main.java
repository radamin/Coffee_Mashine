package CoffeeMachine;

public class Main {
    /*Создать торговый кофейный автомат,
    напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена.
    Проинициализировать несколько напитков в классе main и торговый автомат,
    воспроизвести логику продажи напитков.
    Сделать согласно принципам ООП, пройденным на семинаре.
     */
    public static void main(String[] args) {
        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addCoffee(new Coffee("Эспрессо", 150, 50, 90))
                .addCoffee(new CoffeeWithMilk("Латте", 350, 150, 90,
                        true, "ваниль"))
                .addCoffee(new CoffeeWithSupplements("Коричный макиато", 200, 80,
                        90, "коричный порошок, какао"))
                .addCoffee(new Coffee("Не кофе", 100, 30, 50))
                .addCoffee(new CoffeeWithMilk("Капучино", 200, 75, 80,
                        false, null));

        apparat.setSugarPortion(5);
        apparat.setSugarPrice(5);
        System.out.println(apparat);
        apparat.saleCoffee("Латте", 1, 500, 2);
        System.out.println(apparat);
        apparat.saleCoffee("Капучино", 2, 1000, 3);
        System.out.println(apparat);
        apparat.saleCoffee("Не кофе", 1, 1, 3);
        System.out.println(apparat);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(apparat.getCash());
        System.out.println(apparat.getSugarPortion());
        System.out.println(apparat.getCoffeeMachine());

    }
}