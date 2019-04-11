
import java.util.NoSuchElementException;

public class FilaEstatica implements TADFila {

    private int fila[];
    private int inicio, fim;

    public FilaEstatica(int tamanho) {
        fila = new int[tamanho];
        inicio = fim = -1;
    }

    @Override
    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        return fim == fila.length - 1;
    }

    @Override
    public int size() {
        return fim + 1;
    }

    @Override
    public void enqueue(int elemento) {
        if (!isFull()) {
            fim++;
            fila[fim] = elemento;
            if (inicio == -1) {
                inicio++;
            }
        }
    }

    @Override
    public int dequeue() throws NoSuchElementException {
        if (!isEmpty()) {
            int retorno = fila[inicio];
            for (int i = inicio; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
            fim--;
            if (fim == -1) {
                inicio--;
            }
            return retorno;
        }
        throw new NoSuchElementException();
    }

    @Override
    public int front() throws NoSuchElementException {
        if (!isEmpty()) {
            return fila[inicio];
        }
        throw new NoSuchElementException();
    }

}
