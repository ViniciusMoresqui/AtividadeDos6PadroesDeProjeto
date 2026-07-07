package adapter;
import factory.Canal;

public class AdapterEnvio implements Canal {

    private ServicoEnvioAntigo servicoAntigo;

    public AdapterEnvio(ServicoEnvioAntigo servicoAntigo){
        this.servicoAntigo = servicoAntigo;
    }

    @Override
    public void enviar(String texto){
        this.servicoAntigo.transmitirTextoAntigo(texto);
    }

}
