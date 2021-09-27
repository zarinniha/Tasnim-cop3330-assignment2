package ex34;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class listRemovalTest {

    @Test
    void createList() {
        listRemoval test1 = new listRemoval();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> result = test1.createList();
        assertEquals(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones","Amanda Cullen","Jeremy Goodwin"),result);

    }
}