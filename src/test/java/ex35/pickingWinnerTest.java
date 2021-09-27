package ex35;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class pickingWinnerTest {

    @Test
    void getRandom() {

        ArrayList<String> list = new ArrayList<>();

        list.add("Zarin");
        list.add("Sam");
        list.add("Alex");
        list.add("moe");
        pickingWinner test = new pickingWinner();
        String input = test.getRandom(list);

        boolean result = (list.contains(input));

        assertEquals(true, result);

    }
}