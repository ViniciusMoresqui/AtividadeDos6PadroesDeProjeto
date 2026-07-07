package strategy;

public class EnvioImediato implements EstrategiaEnvio {
    @Override
    public void processarEnvio(String texto) {
        System.out.printf("IMEDIATO - Enviando agora mesmo: %s", texto);
    }
}