package CollectionFramework;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> retail = new LinkedHashMap<>();
        retail.put("Headphones",2000);
        retail.put("Smartphones",25000);
        retail.put("Earphones",500);
        retail.put("Laptops",70000);
        retail.put("PCs",100000);
        System.out.println(retail);
        System.out.println(retail.get("PCs"));
        boolean contain = retail.containsKey("Smartphones");
        boolean containValue = retail.containsValue(100000);
        System.out.println(contain);
        System.out.println(containValue);
        for(String ret:retail.keySet()){
            System.out.println(retail.get(ret));
        }

        Hashtable<Integer,Integer> table = new Hashtable<>();
    }
}
