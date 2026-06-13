/* Base class Product with fields: name, price.
Method: displayDetails() prints basic info.
Subclasses:
Electronics: add warrantyPeriod
Clothing: add size and material
Grocery: add expiryDate
Override displayDetails() to show product-specific info.
File: ProductCatalog.java. */

class Product{
    public String name;
    public int price;

    public void displayDetails(){
        System.out.println("Item and price!");
    }
}

class Electronics extends Product{
    public int warrantyPeriod;

    public Electronics(String n, int p, int wP){
        this.name = n;
        this.price = p;
        this.warrantyPeriod = wP;
    }

    @Override
    public void displayDetails(){
        System.out.println(name + " costs " + price + " dollars and has a warranty period of " + warrantyPeriod + " years.");
    }
}

class Clothing extends Product{
    public String size;
    public String material;

    public Clothing(String n, int p, String s, String m){
        this.name = n;
        this.price = p;
        this.size = s;
        this.material = m;
    }

    @Override
    public void displayDetails(){
        System.out.println(name + " has a price of " + price + " comes in " + size + " and " + material + ".");
    }
}

class Grocery extends Product{
    public String expiryDate;

    public Grocery(String n, int p, String eD){
        this.name = n;
        this.price = p;
        this.expiryDate = eD;
    }

    @Override
    public void displayDetails(){
        System.out.println(name + " has a price of " + price + " dollars and expires on " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Electronics mouse = new Electronics("Mouse", 65, 2);
        Clothing shirt = new Clothing("T-Shirt", 15, "M", "cotton");
        Grocery apple = new Grocery("Apples", 3, "2027");

        mouse.displayDetails();
        shirt.displayDetails();
        apple.displayDetails();
    }
}
