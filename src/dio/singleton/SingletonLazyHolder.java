package dio.singleton;

public class SingletonLazyHolder {

    private static class Holder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
