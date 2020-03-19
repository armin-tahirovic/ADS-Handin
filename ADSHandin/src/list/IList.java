package list;

public interface IList<T> {
    void addToList(T data);
    int size();
    T get(int index);
    void remove(int index);
    boolean isEmpty();
}
