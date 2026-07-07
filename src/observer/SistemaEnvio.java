package observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaEnvio {

    private List<Observer> observadores = new ArrayList<>();

    public void registrarObservador(Observer o) {
        this.observadores.add(o);
    }

    public void dispararNotificacao(String acao) {
        System.out.printf("\n");
        System.out.printf("\n SISTEMA - Disparando alerta geral sobre: %s", acao);
        System.out.printf("\n");
        for (Observer o : observadores) {
            o.atualizar(acao);
        }
    }
}
