package day60_Functional_Interface;

@FunctionalInterface
public interface DataFunction<T> { // generic type

    T accept(T t);


}
