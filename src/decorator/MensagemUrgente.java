package decorator;
import Builder.Mensagem;

public class MensagemUrgente extends MensagemDecorator{

    private Mensagem mensagemOriginal;

    public MensagemUrgente(Mensagem mensagemDecorada) {
        super(mensagemDecorada);
    }

    public void exibirUrgente() {
        System.out.printf("ALERTA: MENSAGEM URGENTE\n");

        super.exibir();
    }

}
