package ex33;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class magicBallTest {

    @Test
    void createArray() {

        magicBall test1 = new magicBall();
        ArrayList<String> list = new ArrayList<>();
        assertEquals(Arrays.asList("Yes", "No", "Maybe","Ask again later"), test1.createArray());

    }

    @Test
    void getRandom() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later");

        magicBall test3 = new magicBall();
        String input = test3.getRandom(list);

        boolean result = (list.contains(input));

        assertEquals(true, result);


    }



}