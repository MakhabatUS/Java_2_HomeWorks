package hw_2_exceptions;

public class Wardrobe extends Furniture implements Printable {
    private final int drawers;
    private final String wood;

    public Wardrobe(int price, String style, int drawers, String wood) {
        super(price, style);
        this.drawers = drawers;
        this.wood = wood;
    }


    @Override
    public void printInfo() {
        System.out.println("__________" +
                "\n"+getClass().getSimpleName() + ": " +
                "\nDrawers: " + drawers +
                "\nWood: " + wood);
        super.printInfo();
    }
}
