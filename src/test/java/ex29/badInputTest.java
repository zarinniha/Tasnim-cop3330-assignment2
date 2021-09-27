package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class badInputTest {

    @Test
    void validation() {
        badInput test1 = new badInput();
        boolean result1 = test1.validation("ABCD");
        boolean result2 = test1.validation("0");
        boolean result3 = test1.validation("4");

        assertEquals(false,result1);
        assertEquals(false,result2);
        assertEquals(true,result3);

    }

    @Test
    void getYears() {
        badInput test2 = new badInput();
        double result = test2.getYears(4);
        assertEquals(18.0,result);
    }
}