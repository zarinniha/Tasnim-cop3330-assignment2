package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class valdiatingInputsTest {

    @Test
    void fnameValidation() {

        valdiatingInputs test1 = new valdiatingInputs();
        boolean result1=test1.fnameValidation("");
        boolean result2=test1.fnameValidation("j");
        boolean result3=test1.fnameValidation("Jackson");
        assertEquals(false,result1);
        assertEquals(false,result2);
        assertEquals(true,result3);


    }

    @Test
    void lnameValidation() {
        valdiatingInputs test2 = new valdiatingInputs();
        boolean result1=test2.lnameValidation("");
        boolean result2=test2.lnameValidation("j");
        boolean result3=test2.lnameValidation("Jackson");
        assertEquals(false,result1);
        assertEquals(false,result2);
        assertEquals(true,result3);

    }

    @Test
    void validateId() {
        valdiatingInputs test3 = new valdiatingInputs();
        boolean result1=test3.validateId("A12-1234");
        boolean result2=test3.validateId("TK-4321");
        assertEquals(false,result1);
        assertEquals(true,result2);


    }

    @Test
    void validateZip() {

        valdiatingInputs test = new valdiatingInputs();
        boolean result1=test.validateZip("ABCDE");
        boolean result2=test.validateZip("55555");
        assertEquals(false,result1);
        assertEquals(true,result2);
    }
}