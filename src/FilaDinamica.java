
import java.util.NoSuchElementException;

public class FilaDinamica implements TADFila {

    private Node inicio, fim;
    private int quantidade;

    public FilaDinamica() {
        quantidade = 0;
        inicio = fim = null;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void enqueue(int elemento) {
        Node novo = new Node(elemento);
        if (!isEmpty()) {
            fim.proximo = novo;
        } else {
            inicio = novo;
        }
        fim = novo;
        quantidade++;
    }

    @Override
    public int dequeue() throws NoSuchElementException {
        if (!isEmpty()) {
            Node aux = inicio;
            inicio = inicio.proximo;
            aux.proximo = null;
            quantidade--;
            if (inicio == null) {
                fim = null;
            }
            return aux.elemento;
        }
        throw new NoSuchElementException();
    }

    @Override
    public int front() throws NoSuchElementException {
        if (!isEmpty()) {
            return inicio.elemento;
        }
        throw new NoSuchElementException();
    }

}
