package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class computingStatisticsTest {

    @Test
    void average() {
        ArrayList<Double> list = new ArrayList<>();
        computingStatistics test1= new computingStatistics();

        list.add(10.0);
        list.add(30.0);
        list.add(20.0);

        double result1= test1.average(list);

        assertEquals(20,result1);

    }

    @Test
    void max() {
        ArrayList<Double> list = new ArrayList<>();
        computingStatistics test2= new computingStatistics();

        list.add(10.0);
        list.add(30.0);
        list.add(20.0);

        double result2= test2.max(list);

        assertEquals(30,result2);
    }

    @Test
    void min() {

        ArrayList<Double> list = new ArrayList<>();
        computingStatistics test3= new computingStatistics();

        list.add(10.0);
        list.add(30.0);
        list.add(20.0);

        double result3= test3.min(list);

        assertEquals(8.16,result3);
    }

    @Test
    void std() {
        ArrayList<Double> list = new ArrayList<>();
        computingStatistics test4= new computingStatistics();

        list.add(10.0);
        list.add(30.0);
        list.add(20.0);

        double result4= test4.std(list);

        assertEquals(8.16496580927726,result4);
    }
}