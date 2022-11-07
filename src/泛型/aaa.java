package 泛型;

public class aaa<T> implements GenericIMP<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
