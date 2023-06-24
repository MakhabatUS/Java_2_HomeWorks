package hw_2_exceptions;


public class Main {

    public static void main(String[] args) {
/* MAIN TASK:
a) Complete the practical assignment from the presentation.
b) Create a 2-level hierarchy of 4 classes (1st - parent -> 2nd, 3rd, 4th - children, with different fields).
c) Create a Printable Interface with a void print() method;
d) Implement the Printable interface with 2nd, 3rd and 4th classes, override the interface method so that it prints
whole information about the object.
e)  In the Main class create the return method createObject (String className), which can create objects of the 2nd,
3rd and 4th  class and after creating and setting properties for the object, the method returns a reference to the object (console).
Switch can be used in order to determine what type you need to create an object instance.
f) In the main class Main create 3 different objects of  2nd, 3rd and 4th classes using the createObject method,
and print information on them using the print() method */

        try {
            createObject("Sofa").printInfo();
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Operation is finished");
        }

    }

    // createObject(String classname) method using Enhanced Switch Statement
    // Here Furniture can also be replaced with Printable

    public static Furniture createObject(String className) throws MyException {

        return switch (className) {
            case "Sofa" -> new Sofa(500, "Art-Deco", "Wood");
            case "Bed" -> new Bed(400, "Hi-Tech", 2, "Latex");
            case "Wardrobe" -> new Wardrobe(450, "Modern", 6, "Walnut");
            default -> throw new MyException("Wrong value!");
        };


    }

}










