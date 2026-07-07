package decorator;
import Builder.Mensagem;

public class MensagemUrgente extends MensagemDecorator{

    private Mensagem mensagemOriginal;

    public MensagemUrgente(Mensagem mensagemDecorada) {
        super(mensagemDecorada);
    }

    @Override
    public void exibir() {
        System.out.printf("ALERTA: MENSAGEM URGENTE\n");

        super.exibir();
    }

}
