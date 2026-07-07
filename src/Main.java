import Builder.Mensagem;
import Builder.MensagemBuilder;
import decorator.MensagemUrgente;
import factory.Canal;
import factory.CanalFactory;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\n");
        System.out.printf("1 - Builder");

        Mensagem msg = new MensagemBuilder().de("Vinicius").para("Professor João").
                comTexto("Segue a atividade de recuperação.").build();
        msg.exibir();

        System.out.printf("\n");

        System.out.printf("===============================================");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("2 - Factory");

        CanalFactory factory = new CanalFactory();

        Canal meuCanal = factory.criarCanal("SMS");
        meuCanal.enviar("Olá, o código funciona");

        System.out.printf("\n");

        System.out.printf("===============================================");

        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("3 - Decorator");

        Mensagem msgNormal = new MensagemBuilder().de("Vinicius").para("João").comTexto("Decorator feito").build();

        MensagemUrgente mensagemUrgente = new MensagemUrgente(msgNormal);

        mensagemUrgente.exibir();

        System.out.printf("\n");

        System.out.printf("===============================================");

    }
}