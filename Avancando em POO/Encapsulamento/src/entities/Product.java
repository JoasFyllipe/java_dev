package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){
    }
    public Product(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
    public Product( String name, double price) {
        this.price = price;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public double totalValuesInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " unitis, Total: $ "
            + String.format("%.2f", totalValuesInStock());

    }

}
