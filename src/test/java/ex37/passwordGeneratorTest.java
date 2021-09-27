package ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class passwordGeneratorTest {


    @Test
    void charTostring() {

        passwordGenerator test = new passwordGenerator();
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        String result =test.charTostring(list);
        assertEquals("abcd",result);
    }

}