package hw_2_exceptions;

public class Bed extends Furniture  implements Printable {
    private int size;
    private String mattress;

    public Bed(int price, String style, int size, String mattress) {
        super(price, style);
        this.size = size;
        this.mattress = mattress;
    }


    @Override
    public void printInfo() {
        System.out.println("__________" +
                "\n"+getClass().getSimpleName() + ": " +
                "\nSize: " + size +
                "\nMattress: " + mattress);
        super.printInfo();
    }
}
