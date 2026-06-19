/* Class FoodItem: private fields name, price
Subclasses:
Pizza: add size, toppings[]
Burger: add cheese, pattyType
Salad: add ingredients[]
Use encapsulation and override method displayMenuItem()
File: FoodOrderApp.java */

import java.util.Arrays;

class FoodItem {
    private String name;
    private double price;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public double getPrice(){
        return price;
    }

    public void displayMenuItem(){
        System.out.println("----------------------");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}

class Pizza extends FoodItem {
    public String size;
    public String toppings[];

    public Pizza(String s, String[] t){
        this.size = s;
        this.toppings = t;
    }

    @Override
    public void displayMenuItem(){
        System.out.println("----------------------");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + Arrays.toString(toppings));
    }
}

class Burger extends FoodItem {
    public String cheese;
    public String pattyType;

    public Burger(String c, String pT){
        this.cheese = c;
        this.pattyType = pT;
    }

    @Override
    public void displayMenuItem(){
        System.out.println("----------------------");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Cheese: " + cheese);
        System.out.println("Patty Type: " + pattyType);
    }
}

class Salad extends FoodItem {
    public String ingredients[];

    public Salad(String[] i){
        this.ingredients = i;
    }

    public void displayMenuItem(){
        System.out.println("----------------------");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Ingredients: " + Arrays.toString(ingredients));
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        String[] pizzaToppings = {"Pineapple", "Ham"};
        String[] saladIngredients = {"Lettuce", "Tomatoes", "Cucumbers"};

        Pizza pizza = new Pizza("Medium", pizzaToppings);
        Burger burger = new Burger("Cheddar", "Beef");
        Salad salad = new Salad(saladIngredients);

        pizza.setName("Hawaiian pizza");
        pizza.setPrice(12.50);

        burger.setName("Beef Burger");
        burger.setPrice(5.50);

        salad.setName("Best Salad");
        salad.setPrice(4.25);

        pizza.displayMenuItem();
        burger.displayMenuItem();
        salad.displayMenuItem();
    }
}
