package uusi.set.HasSet;

import java.util.HashSet;

public class HasSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(22);
        evenNumbers.add(212);
        evenNumbers.add(12);
        evenNumbers.add(56);
        evenNumbers.add(8);
        evenNumbers.add(74);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(94);
        numbers.add(123);
        numbers.add(81);
        numbers.add(15);
        numbers.add(212);
        numbers.add(12);
        numbers.add(84);
        numbers.add(8);

        System.out.println("HashSet evenNumbers: " + evenNumbers);
        System.out.println("HashSet Numbers: " + numbers);
        HashSet<Integer> union =new HashSet<>(evenNumbers);
        union.addAll(numbers);
        System.out.println("Union: " + union);
        HashSet<Integer> intersection =new HashSet<>(evenNumbers);
        intersection.retainAll(numbers);
        System.out.println("Intersection: " + intersection);
        HashSet<Integer> difference =new HashSet<>(numbers);
        difference.removeAll(evenNumbers);
        System.out.println("Difference (numbers without evenNumbers): " + difference);
    }
}
