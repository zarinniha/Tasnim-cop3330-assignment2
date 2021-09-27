package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordStrengthTest {

    @Test
    void passwordValidator() {

        passwordStrength test = new passwordStrength();
        int result1=test.passwordValidator("12345");
        int result2=test.passwordValidator("abcdef");
        int result3=test.passwordValidator("abc123xyz");
        int result4=test.passwordValidator("1337h@xor!");
        assertEquals(1,result1);
        assertEquals(2,result2);
        assertEquals(3,result3);
        assertEquals(4,result4);
    }
}