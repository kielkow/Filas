import java.util.NoSuchElementException;

public class FilaCircular implements TADFila {

    public int fila[];
    public int inicio, fim, quantidade;

    public FilaCircular(int tamanho) {
        fila = new int[tamanho];
        inicio = fim = quantidade = 0;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }

    public boolean isFull() {
        return quantidade == fila.length;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void enqueue(int elemento) {
        if (!isFull()) {
            fila[fim] = elemento;
            quantidade++;
            fim = (fim + 1) % fila.length;
        }
    }

    @Override
    public int dequeue() throws NoSuchElementException {
        if (!isEmpty()) {
            int aux = fila[inicio];
            inicio = (inicio + 1) % fila.length;
            quantidade--;
            return aux;
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