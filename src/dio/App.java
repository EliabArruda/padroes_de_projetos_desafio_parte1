package dio;

import dio.facade.Facade;
import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonLazyHolder;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoNormal;
import dio.strategy.ComportamentoOfensivo;
import dio.strategy.Robo;

public class App {
    public static void main(String[] args) {

        /**
         * Testes de Reutilização de instância com o padrão 'Singleton'
         */
        System.out.println("------------------Singleton------------------");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        System.out.println("---------------------------------------------");
        System.out.println();

        /**
         * Testando Variância de Comportamento com o padrão 'Strategy'
         */
        System.out.println("------------------Strategy------------------");

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoOfensivo ofensivo = new ComportamentoOfensivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(ofensivo);
        robo.mover();
        System.out.println("---------------------------------------------");
        System.out.println();

        /**
         * Testando integrações com subsistemas com o padrão 'Facade'
         * Finalidade: Baixar a complexidade dessas integrações
         * através de interfaces que gerem ou busquem informações
         */
        System.out.println("------------------Facade------------------");

        Facade facade = Facade.getFacade();

        facade.migrarCliente("Eliab", "52131295");





    }
}
