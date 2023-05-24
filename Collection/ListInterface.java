package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListInterface {
    public static void main(String[] args) {
        // create List by ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(4);

        System.out.println(arrayList); // [1,5,2,4]

        // create List by LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(2);

        System.out.println(linkedList); // [4, 1, 5, 2]

        // factory methods
        // return immutable array
        List<Integer> factoryOf = List.of(4,2,1,3,5); // immutable
        System.out.println(factoryOf); // [4, 2, 1, 3, 5]
        // factoryOf.add(1); // crate list by of , can't add anymore data

        // change immutable to mutable 
        var mutableArrayList = new ArrayList<>();
        mutableArrayList.add(1); // [1]
        mutableArrayList.addAll(factoryOf);

        System.out.println(mutableArrayList); // [1, 4, 2, 1, 3, 5]
        
        // List General Methods
        var addVal = mutableArrayList.add(2); // last add
        System.out.println(mutableArrayList); // [1, 4, 2, 1, 3, 5, 2]
        var getVal = mutableArrayList.get(mutableArrayList.size()-1);
        System.out.println(getVal);// 2
        var setVal = mutableArrayList.set(3, 3);
        System.out.println(mutableArrayList); // [1, 4, 2, 11111, 3, 5, 2]
        var subList = mutableArrayList.subList(0, 4);
        System.out.println(subList); // [1, 4, 2, 11111]
        System.out.println(mutableArrayList.indexOf(3)); // 3
        System.out.println(mutableArrayList.lastIndexOf(2)); // 6

        ListInterface lif = new ListInterface();

        lif.forEachLoop(factoryOf);
        ListInterface.forLoop(factoryOf);
        ListInterface.internalForEach(factoryOf);
    }

    // list iteration
    // External forEach
    public void forEachLoop(List<Integer> list) {
        for (var data : list) {
            System.out.println("External forEach : " + data);
        }
    }

    // External forLoop
    static void forLoop(List<Integer> list) {
        for (var i = list.size()-1; i >= 0; i--) {
            System.out.println("External forLoop : " + list.get(i));
        }
    }

    // Inernal forEach
    static void internalForEach(List<Integer> list) {
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer data) {
                System.out.println(data);
            }
        });
    }
}

