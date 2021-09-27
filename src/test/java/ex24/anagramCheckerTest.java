package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramCheckerTest {

    @Test
    void isAnagram() {

        anagramChecker test = new anagramChecker();
        boolean result1= test.isAnagram("note","tone");
        boolean result2=test.isAnagram("yes","no");
        assertEquals(true, result1);
        assertEquals(false, result2);
    }
}