package stack;

public interface IStack<T> {
    T pop();
    void push(T obj);
    T peek();
    int size();
    boolean isEmpty();
}
