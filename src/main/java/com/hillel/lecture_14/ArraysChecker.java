package com.hillel.lecture_14;

import java.util.*;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

//        TODO implements result

        ArrayList<String> result = new ArrayList();
        for (int i = list.size()-1; i > -1; i--) {
            result.add(list.get(i));
        }

        return result;
    }

    public String getLongestString(List<String> list) {

//        TODO implements result
        String maxString = " ";
        for(String string : list){
            if(string.length() > maxString.length()){
                maxString = string;
            }
        }


        return maxString;
    }

    public List<String> changeIndex(List<String> list) {

//        TODO implements result

        String indexOne = list.get(1);
        String indexThree = list.get(3);
        list.set(1, indexThree);
        list.set(3, indexOne);

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

//        TODO implements result

        Set<String> stringSet= new LinkedHashSet<>(list);
        ArrayList<String> result = new ArrayList<>();
        result.addAll(stringSet);







        return result;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (String string : list){ // key = string.length(), value = string;
            int length = string.length();
            treeMap.put(length, string);
        }
        System.out.println(treeMap.toString());
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry <Integer, String> lenght: treeMap.entrySet()){ // adding from treeMap (already sorted by key) to list in the same order
            result.add(lenght.getValue());
        }

        return result;
    }
}
