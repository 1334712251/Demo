package demo1;


public class AmericanCoffeeFactory implements CoffeeFactory {


    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}