package hw_1_oop;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	/* MAIN TASK:
a) Create a hierarchy of 3 classes (1st -> 2nd -> 3rd level of the hierarchy), make the last 3rd class not inheritable
b) All class fields must be private, one of the fields must be of a complex type created by you (4th class),
    make one of the fields a complex type (enum)
c) Classes should not have setters, only getters and constructors
d) Add overloaded methods (2-3 pcs.) to the class of the 2nd level of the hierarchy, make one of them non-rewritable
e) In the 3rd level class, overwrite one of the parent methods
f) In the main class (hw_1.Main) Create an object of the 2nd level class (objectA) and 2 objects of the 3rd level class (objectB, objectC),
    also print all properties of objects and call overloaded methods through each of your object instances.

        ADDITIONAL TASK:
g)  Create a method in a third-level class that would copy some properties from a self-like object
h) Then copy some properties from objectB to objectC and print information on objectC*/


        // object A using method "final String info(String color, String pattern)"
        T_Shirt t_shirt = new T_Shirt("Adidas",
                new Manufacture("Polyester", "Vietnam"), Size.S);
        System.out.println(t_shirt.info("White", "Stripes"));


        // object B using method "public String info()"
        Polo_Shirt polo_shirt = new Polo_Shirt("Nike",
                new Manufacture("Cotton", "China"), Size.M, "\"Just do it\"");
        System.out.println(polo_shirt.info());


        /*!!! Additional Task: Object C is cloning Object B and resetting Sign details
         using CLONING OBJECT METHOD */
        Polo_Shirt cloned_polo_shirt = (Polo_Shirt) polo_shirt.clone();
        cloned_polo_shirt.setSign("Impossible is nothing");
        System.out.println(cloned_polo_shirt.info());


    }
}
