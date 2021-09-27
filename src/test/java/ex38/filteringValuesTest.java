package ex38;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class filteringValuesTest {

    @Test
    void filterEvenNumbers() {

        filteringValues test = new filteringValues();
        Integer[] expected = {2, 4, 8, 12};
        String[] Numb = {"2", "4", "8", "12","17","35","89"};

        Integer[] result = test.filterEvenNumbers(Numb);
        assertArrayEquals(expected, result);


    }
}