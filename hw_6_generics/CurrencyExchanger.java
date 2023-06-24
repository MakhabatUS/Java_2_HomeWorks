package hw_6_generics;

public class CurrencyExchanger<T extends Number, S extends Number> implements Convertible<T, S> {

    private final T rate;

    private final S amount;


    public S getAmount() {
        return amount;
    }

    public T getRate() {
        return rate;
    }

    public CurrencyExchanger(T rate, S amount) {
        this.rate = rate;
        this.amount = amount;
    }

    @Override
    public void convert(T rate, S amount) {
        float result = amount.floatValue()/rate.floatValue() ;
        System.out.println("Amount after conversion: " + result);

    }
}


    
