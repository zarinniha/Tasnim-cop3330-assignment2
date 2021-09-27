package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class heartRateTest {

    @Test
    void validateString() {

        heartRate test = new heartRate();
        boolean result1=test.validateString("Ab");
        boolean result2=test.validateString("45");

        assertEquals(false,result1);
        assertEquals(true,result2);
    }
}