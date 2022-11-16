package dio.singleton;

public class App {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    }
}
