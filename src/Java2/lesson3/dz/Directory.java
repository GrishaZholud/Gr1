package Java2.lesson3.dz;

import java.util.List;
import java.util.Map;

public class Directory {

    public void add(String name,int num,Map<String,Integer> two){
        two.put(name,num);
    }
    public void get(Map<String,Integer> map){
        System.out.println(map);
}
}
