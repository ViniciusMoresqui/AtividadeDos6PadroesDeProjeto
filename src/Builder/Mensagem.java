package Builder;

public class Mensagem {

    private String remetente;
    private String destinatario;
    private String conteudo;

    public Mensagem(String remetente, String destinatario, String conteudo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
    }

    public void exibir() {
        System.out.println("De: " + this.remetente);
        System.out.println("Para: " + this.destinatario);
        System.out.println("Mensagem: " + this.conteudo);
    }

}
