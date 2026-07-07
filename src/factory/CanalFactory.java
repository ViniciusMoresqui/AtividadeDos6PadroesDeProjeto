package factory;

public class CanalFactory {

    public Canal criarCanal(String tipo) {
        if (tipo.equalsIgnoreCase("SMS")) {
            return new CanalSMS();
        } else if (tipo.equalsIgnoreCase("EMAIL")) {
            return new CanalEmail();
        }
        return null;
    }
}
