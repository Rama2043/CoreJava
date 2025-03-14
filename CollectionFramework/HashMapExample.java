package CollectionFramework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Watermelon");
        map.put(4,"Pineapple");
        System.out.println(map);
        System.out.println(map.get(3));
        boolean contain = map.containsKey(2);
        System.out.println(contain);
        boolean containValue = map.containsValue("Banana");
        System.out.println(containValue);
        for(Integer key:map.keySet()){
            System.out.println(map.get(key));
        }
        System.out.println();
    }
}
