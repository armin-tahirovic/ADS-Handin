import list.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @org.junit.jupiter.api.Test
    void addToList() {
        List<Integer> list = new List<>();
        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        list.addToList(4);
        list.addToList(5);

        assertEquals(list.get(1), 2);
        assertEquals(list.get(4), 5);
    }

    @org.junit.jupiter.api.Test
    void size() {
        List<Integer> list = new  List<>();
        assertEquals(list.size(), 0);

        list.addToList(1);
        assertEquals(list.size(), 1);

        list.addToList(1);
        assertEquals(list.size(), 2);
    }

    @org.junit.jupiter.api.Test
    void get() {
        List<Integer> list = new  List<>();
        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        list.addToList(4);
        list.addToList(5);

        assertEquals(list.get(0),1);
        assertEquals(list.get(1),2);
        assertEquals(list.get(2),3);
        assertEquals(list.get(3),4);
        assertEquals(list.get(4),5);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        List<Integer> list = new List<>();

        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        assertEquals(list.get(1),2);

        list.remove(1);
        assertEquals(list.get(1),3);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        List<Integer> list = new  List<>();
        assertTrue(list.isEmpty());

        list.addToList(1);
        assertFalse(list.isEmpty());
    }
}