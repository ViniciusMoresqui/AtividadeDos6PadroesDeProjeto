package strategy;

public class EnvioAgendado implements EstrategiaEnvio{

        @Override
        public void processarEnvio(String texto) {
            System.out.printf("AGENDADO - Mensagem salva para enviar de madrugada: %s", texto);
        }

}
