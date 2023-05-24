package Collection;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        // Set Collection
        // create HashSet , TreeSet, LinkedHashSet object 
        Set<String> hashSet = new HashSet<>(); // [1,2,4,5]
        Set<String> treeSet = new TreeSet<>(); //add data by order [1,2,4,5]
        Set<String> linkedHashSet = new LinkedHashSet<>(); // [5, 3, 1, 2]

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("5");
        hashSet.add("4");
        
        treeSet.add("1");
        treeSet.add("5");
        treeSet.add("3");
        treeSet.add("2");

        linkedHashSet.add("5");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        
        // Set Factory Methods
        // create set object using Set Factory Methods -> return immutable set object
        var set = Set.of("Hello"); // ["Hello"]

        // change muutable to immutable set object
        Set<String> mutable = new HashSet<>(); // [Hello]
        mutable.add("Hello");
        var immutable = Set.copyOf(mutable); // [Hello] return immutable set object
        immutable.add("Hello");

        // Set Methods
        var setOne = new HashSet<Integer>();
        var setTwo = Set.of(1,2,3,4,5);
        var setIteration = new HashSet<>(setTwo);
        setOne.add(1); // [1]
        setOne.addAll(setTwo); // [1,2,3,4,5]

        setOne.remove(3); // [1, 2, 4, 5]
        setOne.contains(1); // true
        setOne.clear(); // []

        var predictable = new Predicate<Integer>() {
            public boolean test(Integer data) {
                return data % 2 != 0;
            }
        };
        
        setOne.removeIf(predictable); // [2,4]


        var array = setOne.toArray(); // Object[2] { 2, 4 }

        var arrayTwo = setOne.toArray(new Integer[setOne.size()]); // Integer[2] { 2, 4 }
        

        // Iteration
        SetInterface.forLoop(setIteration);


    }

    // Iteration
    // var setIterate = Set.of(1,2,5,4,3)
    // SetInterface.forLoop(setIterate)
    // external iteration
    static void forLoop(Set<Integer> set) {
        for (var ele : set) {
            System.out.println(ele); // 54321
        }
    }


    // var setIterate = Set.of(1,2,5,4,3)
    // SetInterface.internalForLoop(setIterate)
    // internal iteration
    static void internalForLoop(Set<Integer> set) {
        set.forEach(new Consumer<Integer>() {
            public void accept(Integer data) {
                System.out.println(data); // 54321
            }
        });
    }
}
