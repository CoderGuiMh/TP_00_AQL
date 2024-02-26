package Exercice_2Test;

import ClassATester.StackExercice_2.Stack;
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
        assertEquals(4, stack.getTopOfStack());
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
        assertEquals(100, stack.getTopOfStack());
    }
}
