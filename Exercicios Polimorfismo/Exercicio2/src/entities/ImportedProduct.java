package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(Double price, String name, Double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public Double getCustomsFree() {
        return customsFee;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFee = customsFree;
    }

    public double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return  getName()
                + String.format(" %.2f $ ", totalPrice())
                +"(Customs fee: $ "
                +String.format("%.2f )", customsFee);
    }
}
