import Builder.Mensagem;
import Builder.MensagemBuilder;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\n");
        System.out.printf("1 - Builder");

        Mensagem msg = new MensagemBuilder().de("Vinicius").para("Professor João").
                comTexto("Segue a atividade de recuperação.").build();
        msg.exibir();

        System.out.printf("===============================================");
        System.out.printf("\n");
    }
}