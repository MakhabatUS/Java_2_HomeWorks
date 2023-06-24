package hw_2_exceptions;

public class Furniture implements Printable {
    private final int price;
    private final String style;

    public Furniture(int price, String style) {
        this.price = price;
        this.style = style;
    }

    @Override
    public void printInfo() {
        System.out.println("Price: " + price +
                           "\nStyle: " + style);

    }
}
