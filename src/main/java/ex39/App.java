/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex39;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;


class sortingRecords {

    //sorting the list of maps
  static class ListMapComparator implements Comparator {
        public int compare(Object obj1, Object obj2) {
            Map<String, String> test1 = (Map<String, String>) obj1;
            Map<String, String> test2 = (Map<String, String>) obj2;
            return test1.get("lname").compareTo(test2.get("lname"));
        }
    }


    //creating the map

    public static void getMap(HashMap<String, String> map, String firstName, String lastName, String job, String Date) {
        map.put("fname", firstName);
        map.put("lname", lastName);
        map.put("position", job);
        map.put("date", Date);
    }

    //creating the list of maps

    public static ArrayList<Map> getList(HashMap<String, String> first, HashMap<String, String> second, HashMap<String,
            String> third, HashMap<String, String> fourth, HashMap<String, String> fifth, HashMap<String, String> sixth) {
        ArrayList<Map> list = new ArrayList<Map>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);
        return list;
    }

    //printing the list

    public static void printMethod( ArrayList<Map> list ) {
        System.out.println(String.format("%s\t\t\t |%15s |%10s", "Name", "Position", "Seperation Date"));
        System.out.println(String.format("-----------------|----------------|---------------"));

        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = new HashMap<>();

            map = list.get(i);

            String fname = map.get("fname");
            String lname = map.get("lname");
            String position = map.get("position");
            String date = map.get("date");

            System.out.println(String.format("%s %s| %20s| %20s", fname, lname, position, date));
        }
    }


    public static void main(String args[]) {

        HashMap<String, String> first = new HashMap<>();
        getMap(first, "John", "Johnson", "Manager", "2016-12-31");

        HashMap<String, String> second = new HashMap<>();
        getMap(second, "Tou", "Xiong", "Software Engineer", "2016-10-05");


        HashMap<String, String> third = new HashMap<>();
        getMap(third, "Michaela", "Michaelson", "District Manager", "2015-12-19");

        HashMap<String, String> fourth = new HashMap<>();
        getMap(fourth, "Jake", "Jacobson", "Programmer", " ");


        HashMap<String, String> fifth = new HashMap<>();
        getMap(fifth, "Jacquelyn", "Jackson", "DBA", " ");


        HashMap<String, String> sixth = new HashMap<>();
        getMap(sixth, "Sally", "Webber", "Web Developer", "2015-12-18");

        ArrayList<Map> list = getList(first, second, third, fourth, fifth, sixth);

        Collections.sort(list, new ListMapComparator());
        printMethod(list);


        }


    }




