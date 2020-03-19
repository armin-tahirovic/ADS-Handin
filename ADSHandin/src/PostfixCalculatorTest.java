import list.List;
import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest {

    @Test
    void calculate() {
        List<Integer> list = new List<>();
        Stack<Integer> stack = new Stack<>(list);
        PostfixCalculator pc = new PostfixCalculator(list, stack);
        assertEquals(pc.calculate("82+5*"),50);
    }
}