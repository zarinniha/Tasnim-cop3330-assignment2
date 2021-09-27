package ex39;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class sortingRecordsTest {


    @Test
    void getList() {

        sortingRecords test1 = new sortingRecords();
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        HashMap<String, String> map4 = new HashMap<>();
        HashMap<String, String> map5 = new HashMap<>();
        HashMap<String, String> map6 = new HashMap<>();

        ArrayList<Map> result = test1.getList(map1,map2,map3,map4,map5,map6);
        assertEquals(result.size(),6);
    }
}