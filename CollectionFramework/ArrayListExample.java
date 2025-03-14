package CollectionFramework;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rama");
        names.add("Rishi");
        names.add("Hruthik");
        names.add("Laasya");
        names.add("Manohar");
        names.add("Sailu");
        names.add(1,"Rama");
        System.out.println(names.size());
        System.out.println("Initial ArrayList: "+names);
        System.out.println("Element at Index 1: "+names.get(1));
        for(String name:names){
            System.out.println(name);
        }
        names.remove("Rama");
        System.out.println("After removal: "+names);
        names.set(0,"Kasyap");
        System.out.println(names);
        boolean contain = names.contains("manohar");
        System.out.println(contain);
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);
        names.clear();
        System.out.println(names);

        Queue<Integer> queue = new LinkedList<>();

    }
}
