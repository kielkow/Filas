
import java.util.NoSuchElementException;

public class TesteDinamico {

    public static void main(String[] args) {
        FilaDinamica f = new FilaDinamica();
        f.enqueue(5);
        f.enqueue(10);
        f.enqueue(15);
        f.enqueue(20);
        try {
            System.out.println(f.dequeue());
            System.out.println(f.dequeue());
            System.out.println(f.dequeue());
            System.out.println(f.dequeue());
            System.out.println(f.dequeue());
        } catch (NoSuchElementException e) {
            System.out.println("Fila vazia");
        }
    }
}
