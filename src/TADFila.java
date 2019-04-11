
import java.util.NoSuchElementException;

public interface TADFila {
    public boolean isEmpty();
    //public boolean isFull();
    public int size();
    public void enqueue(int elemento);
    public int dequeue() throws NoSuchElementException;
    public int front() throws NoSuchElementException;
}
