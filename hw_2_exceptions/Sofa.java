package hw_2_exceptions;

public class Sofa extends Furniture implements Printable{
    private final String frame;

    public Sofa(int price, String style, String frame) {
        super(price, style);
        this.frame = frame;
    }

    @Override
    public void printInfo() {
        System.out.println("__________" +
                "\n"+getClass().getSimpleName() + ": " +
                "\nFrame: " + frame);
        super.printInfo();
    }
}
