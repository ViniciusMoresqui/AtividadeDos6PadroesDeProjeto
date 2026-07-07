package factory;

public class CanalEmail implements Canal {
    @Override
    public void enviar(String texto) {
        System.out.println("[Mensagem] Enviando no email: " + texto);
    }
}
