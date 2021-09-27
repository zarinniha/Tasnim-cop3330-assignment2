package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator test= new PaymentCalculator();
        double result = test.calculateMonthsUntilPaidOff(12,5000,100);
        assertEquals(70.0,result);
    }
}