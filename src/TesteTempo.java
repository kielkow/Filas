
import java.util.concurrent.TimeUnit;


public class TesteTempo {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE/100);
        int n = Integer.MAX_VALUE/100;
        FilaEstatica filaEstatica = new FilaEstatica(n);
        FilaCircular filaCircular = new FilaCircular(n);
        for (int i = 0; i < n; i++) {
            filaEstatica.enqueue(i);
            filaCircular.enqueue(i);
        }
        long tempoInicial, tempoFinal;
        
        tempoInicial = System.nanoTime();
        while (!filaEstatica.isEmpty()) {            
            filaEstatica.dequeue();
        }
        tempoFinal = System.nanoTime();
        System.out.println("Remoção Linear: " + (tempoFinal - tempoInicial) + "ns" + " - " + TimeUnit.MILLISECONDS.convert((tempoFinal - tempoInicial), TimeUnit.NANOSECONDS) + "ms");
        
        tempoInicial = System.nanoTime();
        while (!filaCircular.isEmpty()) {            
            filaCircular.dequeue();
        }
        tempoFinal = System.nanoTime();
        System.out.println("Remoção Circular: " + (tempoFinal - tempoInicial) + "ns" + " - " + TimeUnit.MILLISECONDS.convert((tempoFinal - tempoInicial), TimeUnit.NANOSECONDS) + "ms");
    }
}
