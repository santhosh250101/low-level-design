package decoratorpattern;

public class ExtraCheese extends ToppingDecorator{


    Burger baseBurger;

    public ExtraCheese(Burger burger) {
        this.baseBurger = burger;
    }

    @Override
    public int cost() {
        return this.baseBurger.cost() + 25;
        
    }
    
}
