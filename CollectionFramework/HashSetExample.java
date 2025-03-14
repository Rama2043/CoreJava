package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.size());
        boolean contain = numbers.contains(5);
        System.out.println(contain);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println("Printing using For loop");
        for(Integer number:numbers)
        {
            System.out.println(number);
        }
        System.out.println("Printing using Iterator");
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}