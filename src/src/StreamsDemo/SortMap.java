package StreamsDemo;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Akash",1);
        map.put("Prakash",19);
        map.put("Jubior",5);
        map.put("Test",14);

        //Ways to sort a map:
        //First Way traditional
//        List<Map.Entry<String,Integer>> mapList = new ArrayList<>(map.entrySet());
//        Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        });
//        System.out.println(mapList);

        //Second way
        map.entrySet().stream().sorted((o1,o2)-> o1.getValue() - o2.getValue()).forEach(t-> System.out.println(t));

        //Sorting a map with key as a object;



    }
}
