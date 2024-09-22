package util;

public class CurrencyConverter {

    public static double priceDollar;
    public static final double IOF = 0.06;

    public static double vallueDollarGet(double quantityDollarGet){
        return priceDollar * quantityDollarGet;
    }
}
