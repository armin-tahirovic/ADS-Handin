package stack;

import list.List;

public class Stack<T> implements IStack<T> {


    private List<T> list;

    public Stack(List<T> list) {
        this.list = list;
    }

    @Override
    public T pop() {
        T index = list.get(list.size()-1);
        list.remove(list.size()-1);
        return index;
    }

    @Override
    public void push(T obj) {
        list.addToList(obj);
    }

    @Override
    public T peek() {
        return list.get(list.size()-1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
