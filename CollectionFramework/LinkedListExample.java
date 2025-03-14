package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Wolf");
        animals.add("Lion");
        animals.add("Elephant");
        System.out.println("Initial List: "+animals);
        animals.addFirst("Dinosaur");
        System.out.println("After adding the element at first: "+animals);
        animals.addLast("Cheetah");
        System.out.println("After adding element at Last: "+animals);
        System.out.println("First element: "+animals.getFirst());
        System.out.println("Last element: "+animals.getLast());
        animals.set(2,"Fox");
        System.out.println("After changing value using set() method: "+animals);
        animals.removeFirst();
        System.out.println("After removing first element: "+animals);
        animals.removeLast();
        System.out.println("After removing last element: "+animals);
        System.out.println("Printing using For loop");
        for(String animal:animals){
            System.out.println(animal);
        }
        System.out.println("Printing using Iterator");
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        boolean contain = animals.contains("Lion");
        System.out.println(contain);
        boolean isEmpty = animals.isEmpty();
        System.out.println(isEmpty);
        animals.clear();
        System.out.println(animals);

    }
}
