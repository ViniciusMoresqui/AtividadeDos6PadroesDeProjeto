package decorator;

import Builder.Mensagem;

public class MensagemDecorator {

    protected Mensagem mensagemDecoracao;

    public MensagemDecorator(Mensagem mensagemDecoracao) {
        this.mensagemDecoracao = mensagemDecoracao;

    }

    public void exibir() {
        this.mensagemDecoracao.exibir();
    }

}
