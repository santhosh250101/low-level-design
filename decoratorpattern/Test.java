package decoratorpattern;

public class Test {

    public static void main(String[] args) {
        // Burger burger = new ZingerBurger();
        // System.out.println(burger.cost());


        Burger extraCheeseZingerBurger =new ExtraCheese(new ZingerBurger());

        System.out.println(extraCheeseZingerBurger.cost());
    }
    
}
