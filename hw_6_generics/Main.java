package hw_6_generics;

public class Main {

    public static void main(String[] args) {


        CurrencyExchanger<Double, Double> currencyExchanger1 = new CurrencyExchanger <>(5.5, 45.4);
        currencyExchanger1.convert(currencyExchanger1.getRate(), currencyExchanger1.getAmount());

        CurrencyExchanger<Float, Integer> currencyExchanger2 = new CurrencyExchanger <>(39.4523F, 9800);
        currencyExchanger2.convert(currencyExchanger2.getRate(), currencyExchanger2.getAmount());


    }
}