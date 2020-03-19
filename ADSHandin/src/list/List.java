package list;


public class List<T> implements IList<T> {

    private Node<T> head;
    private int size;

    public List() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addToList(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {

            Node<T> node = new Node(data);

            // Midlertidig variabel
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Laver reference til det sidste element
            temp.next = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (0 > index || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            return head.data;
        }

        // Iterere op til efterspurgt index
        int i = 0;
        Node<T> temp = head;
        while (temp != null) {
            if (i == index) {
                return temp.data;
            }
            temp = temp.next;
            i++;
        }
        return null;
    }

    @Override
    public void remove(int index) {
        if (0 > index || index >= size) throw new IndexOutOfBoundsException();

        if (head != null && index == 0) {
            size--;
            head = head.next;
            return;
        }
        // Iterere op til efterspurgt index
        int i = 0;
        Node<T> temp = head;
        Node<T> prev = null;
        while (temp != null) {
            if (i == index) {
                prev.next = temp.next;
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
