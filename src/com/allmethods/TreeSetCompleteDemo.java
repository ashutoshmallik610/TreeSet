package com.allmethods;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Arrays;

public class TreeSetCompleteDemo {
    public static void main(String[] args) {
        // 1. Initialization (Using Default Constructor)
        TreeSet<Integer> set = new TreeSet<>();

        // 2. Adding Elements - add() & addAll()
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(50);
        set.add(20);
        System.out.println("Initial TreeSet (Sorted automatically): " + set);
        
        set.addAll(Arrays.asList(60, 70));
        System.out.println("After addAll [60, 70]: " + set);

        // 3. Inspection - size(), isEmpty(), contains(), containsAll()
        System.out.println("Size of set: " + set.size());
        System.out.println("Is set empty? " + set.isEmpty());
        System.out.println("Contains 30? " + set.contains(30));
        System.out.println("Contains all [10, 20]? " + set.containsAll(Arrays.asList(10, 20)));

        // 4. Advanced Navigation - first(), last(), lower(), floor(), ceiling(), higher()
        System.out.println("First (lowest) element: " + set.first());
        System.out.println("Last (highest) element: " + set.last());
        System.out.println("Lower than 30 (< 30): " + set.lower(30));
        System.out.println("Floor of 35 (<= 35): " + set.floor(35));
        System.out.println("Ceiling of 35 (>= 35): " + set.ceiling(35));
        System.out.println("Higher than 30 (> 30): " + set.higher(30));

        // 5. Range Views - subSet(), headSet(), tailSet()
        System.out.println("SubSet from 20 (inc) to 50 (exc): " + set.subSet(20, 50));
        System.out.println("HeadSet up to 40 (exc): " + set.headSet(40));
        System.out.println("TailSet from 40 (inc): " + set.tailSet(40));

        // 6. Iteration - iterator() & descendingIterator()
        System.out.print("Iterating in Ascending Order: ");
        Iterator<Integer> ascIterator = set.iterator();
        while (ascIterator.hasNext()) {
            System.out.print(ascIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Iterating in Descending Order: ");
        Iterator<Integer> descIterator = set.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println();
        
        System.out.println("Descending Set View: " + set.descendingSet());

        // 7. Polling - pollFirst() & pollLast()
        System.out.println("Polled (Removed) First: " + set.pollFirst());
        System.out.println("Polled (Removed) Last: " + set.pollLast());
        System.out.println("Set after polling: " + set);

        // 8. Removal & Cleanup - remove(), removeAll(), clear()
        set.remove(30);
        System.out.println("After removing 30: " + set);
        
        set.removeAll(Arrays.asList(20, 40));
        System.out.println("After removeAll [20, 40]: " + set);

        set.clear();
        System.out.println("After clear(), size is: " + set.size());
    }
}
