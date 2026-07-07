import Builder.Mensagem;
import Builder.MensagemBuilder;
import adapter.AdapterEnvio;
import adapter.ServicoEnvioAntigo;
import decorator.MensagemUrgente;
import factory.Canal;
import factory.CanalFactory;
import observer.SistemaEnvio;
import observer.Usuario;
import strategy.EnvioAgendado;
import strategy.EnvioImediato;
import strategy.EstrategiaEnvio;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\n");
        System.out.printf("1 - Builder");
        System.out.printf("\n");

        Mensagem msg = new MensagemBuilder().de("Vinicius").para("Professor João").
                comTexto("Segue a atividade de recuperação.").build();
        msg.exibir();

        System.out.printf("\n");

        System.out.printf("===============================================");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("2 - Factory");
        System.out.printf("\n");

        CanalFactory factory = new CanalFactory();

        Canal meuCanal = factory.criarCanal("SMS");
        meuCanal.enviar("Olá, o código funciona");

        System.out.printf("\n");

        System.out.printf("===============================================");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("3 - Decorator");
        System.out.printf("\n");

        Mensagem msgNormal = new MensagemBuilder().de("Vinicius").para("João").comTexto("Decorator feito").build();

        MensagemUrgente mensagemUrgente = new MensagemUrgente(msgNormal);

        mensagemUrgente.exibir();

        System.out.printf("\n");

        System.out.printf("===============================================");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("4 - Adapter");
        System.out.printf("\n");

        ServicoEnvioAntigo servicoEnvioAntigo = new ServicoEnvioAntigo();

        Canal canal = new AdapterEnvio(servicoEnvioAntigo);

        canal.enviar("Texto adaptado com sucesso");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("===============================================");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("5 - Strategy");
        System.out.printf("\n");

        EstrategiaEnvio modoAtual = new EnvioImediato();

        modoAtual.processarEnvio("Alerta de teste");

        System.out.printf("\n");

        modoAtual = new EnvioAgendado();
        modoAtual.processarEnvio("Alerta de teste");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("===============================================");
        System.out.printf("\n");

        System.out.printf("6 - Observer");

        SistemaEnvio sistema = new SistemaEnvio();
        Usuario user1 = new Usuario("Vinicius");

        Usuario user2 = new Usuario("Joao (Professor)");


        sistema.registrarObservador(user1);
        sistema.registrarObservador(user2);

        sistema.dispararNotificacao("Projeto postado no GitHub!");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("===============================================");

    }
}