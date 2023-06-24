package hw_6_generics;

public interface Convertible<T extends Number, S extends  Number> {

     void convert(T amount, S rate);

}
