package observer;

public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String acao) {
        System.out.printf("\n");
        System.out.printf(" NOTIFICAÇÃO PARA  %s: O sistema realizou a ação: %s",nome.toUpperCase(), acao);
        System.out.printf("\n");

    }
}