package LearnJava.Generics;

/**
 * Created by qimingzhang on 2017/4/29.
 */
public class Superclass<T extends Number> {
    private T genericVar;

    public T getGenericVar() {
        return genericVar;
    }
}
