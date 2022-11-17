package dio.facade;

import dio.subsistema1.crm.CrmService;
import dio.subsistema2.cep.CepApi;

public class Facade {

    private static Facade facade = new Facade();

    private Facade(){
        super();
    }

    public static Facade getFacade() {
        return facade;
    }

    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getApi().recuperarCidade(cep);
        String estado = CepApi.getApi().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep, estado, cidade);


    }
}
