package Java2.lesson3.dz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 пункт
        List<String> list = new ArrayList<>(Arrays.asList("air","animal","boy","air","boy","brother","food","food","book","foot","bird","girl","brother","girl","boy"));
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        Map<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            String num = list.get(i);
            Integer val = map.getOrDefault(num,0);
            map.put(num,val+1);
        }
        System.out.println(map);
        //2 пункт
        Map<String,Integer> two = new HashMap<>();
        Directory directory = new Directory();
        directory.add("Wilson",34956747,two);
        directory.add("Moore",4637474,two);
        directory.get(two);

    }

    }

