package stack;

import list.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pop() {
        List<Integer> list = new List<>();
        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        list.addToList(4);
        list.addToList(5);

        Stack stack = new Stack(list);

        assertEquals(stack.pop(),5);

        assertEquals(list.size(),4);
    }

    @Test
    void push() {
        List<Integer> list = new List<>();
        Stack stack = new Stack(list);

        stack.push(1);

        assertEquals(list.get(0),1);
    }

    @Test
    void peek() {
        List<Integer> list = new List<>();
        Stack stack = new Stack(list);

        stack.push(1);
        stack.push(2);

        assertEquals(stack.peek(),2);
    }
}