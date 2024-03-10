package Exercice_2Test;

import ClassATester.Exercice_2_Stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    static Stack stack;
    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    void pushShouldAddAnElementToStack(){
        // Arrange
        stack.push(4);
        // Assert
        assertEquals(1, stack.size());
        assertEquals(4, stack.peek());
    }

    @Test
    void pushShouldExpandArray(){
        // Arrange
        for(int i = 0; i < stack.getArray().length; i++){
            stack.push(i);
        }
        stack.push(100);

        // Assert
        assertEquals(11, stack.size());
        assertEquals(100, stack.peek());
    }

    @Test
    void popShouldRemoveElementFromStack(){
        stack.push(10);
        stack.push(20);

        int top = stack.pop();

        assertEquals(20, top);
        assertEquals(1, stack.size());
    }

    @Test
    void peekShouldReturnTopElement(){
        stack.push(10);
        stack.push(20);

        int top = stack.peek();

        assertEquals(20, top);
        assertEquals(2,stack.size());
    }

}
