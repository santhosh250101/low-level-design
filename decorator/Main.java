package decorator;

import decorator.pizzas.BasePizza;
import decorator.pizzas.Margherita;

public class Main {
    
    public static void main(String[] args) {
        
        BasePizza margheritaPizzaWithMushRoomAndExtraCheese =new Mushroom(new ExtraCheese( new Margherita()));

        System.out.println(margheritaPizzaWithMushRoomAndExtraCheese.cost());
    }
}
