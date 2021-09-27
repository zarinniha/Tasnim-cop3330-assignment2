package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class numberGameTest {

    @Test
    void inputValidation() {
        numberGame test1=new numberGame();
        boolean  result1 = test1.inputValidation("ABC");
        boolean  result2 = test1.inputValidation("1");

        assertEquals(false,result1);
        assertEquals(true,result2);
    }

    @Test
    void chooseLevel() {
        numberGame test2=new numberGame();

        int result1=test2.chooseLevel("1");
        int result2=test2.chooseLevel("2");

        assertEquals(10,result1);
        assertEquals(100,result2);

    }


    @Test
    void getRandom() {

        numberGame test3=new numberGame();
        int num= test3.getRandom(100,1);

        boolean result= (num>=1 &&num<=100);

        assertEquals(true, result);

    }
}