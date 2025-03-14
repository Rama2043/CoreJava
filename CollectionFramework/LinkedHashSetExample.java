package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Ford");
        cars.add("Kia");
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Suzuki");
        System.out.println("Initial Cars: "+cars);
        cars.add("Ford");
        System.out.println("After adding same car: "+cars);
        System.out.println(cars.size());
        boolean contain = cars.contains("Suzuki");
        System.out.println(contain);
        cars.remove("Hyundai");
        System.out.println("After removing a car: "+cars);
        System.out.println("Printing using For loop");
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("Printing using Iterator");
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
