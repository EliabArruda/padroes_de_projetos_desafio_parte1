package dio.subsistema2.cep;

public class CepApi {

    private static CepApi api = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getApi(){
        return api;
    }

    public String recuperarCidade(String cep){
        return "Recife";
    }

    public String recuperarEstado(String estado){
        return "PE";
    }
}
