package factory;

public class CanalSMS implements Canal {
    @Override
    public void enviar(String texto) {
        System.out.println("[SMS] Enviando torpedo: " + texto);
    }
}