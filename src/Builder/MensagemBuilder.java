package Builder;

public class MensagemBuilder {

    private String remetente;
    private String destinatario;
    private String conteudo;

    public MensagemBuilder de(String remetente) {
        this.remetente = remetente;
        return this;
    }

    public MensagemBuilder para(String destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    public MensagemBuilder comTexto(String conteudo) {
        this.conteudo = conteudo;
        return this;
    }

    public Mensagem build(){
        return new Mensagem(this.remetente, this.destinatario, this.conteudo);
    }

}
