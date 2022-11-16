package dio.singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    //Construtor
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
            return instancia;
    }
}
