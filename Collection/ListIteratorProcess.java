package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListIteratorProcess {
    public static void main(String[] args) {
     
        // create list object
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        var itr1 = list.listIterator(); // create list iterator
        var itr2 = list.listIterator(list.size()-1); // create list iterator

        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7]

        // listIterator methods
        itr1.add(100); // [100, 1, 2, 3, 4, 5, 6, 7]
        System.out.println(list.size()); // 8
        System.out.println(itr1.next()); // 1
        System.out.println(itr1.next()); // 2
        System.out.println(itr2.nextIndex()); // 6
        System.out.println(itr2.nextIndex()); // 6
        System.out.println(itr2.previousIndex()); // 5
        // System.out.println(itr2.previous()); // 5

        System.out.println(itr1.next()); // 3
        System.out.println(itr1.next()); // 4
        System.out.println(itr1.next()); // 5
        System.out.println(itr1.nextIndex()); /// 6
        System.out.println(itr1.next()); // 6
        System.out.println(itr1.next()); // 7
        // System.out.println(itr1.next()); // if no element NoSuchElementException error occur
        System.out.println(itr1.hasNext()); // false
        System.out.println(itr1.nextIndex()); /// 8
        System.out.println("previous : " +itr1.previous()); /// 7
        System.out.println(itr1.previous()); /// 6
        System.out.println(itr1.previous()); /// 5
        System.out.println(itr1.previous()); /// 4
        System.out.println(itr1.previous()); /// 3
        System.out.println(itr1.previous()); /// 2
        System.out.println("previous last : " + itr1.previous()); /// 1
        // System.out.println;
        System.out.println(itr1.previousIndex()); // 0
        System.out.println(itr1.next()); // 1
        System.out.println(itr1.next()); // 2
        itr1.set(200);// [100, 1, 200, 3, 4, 5, 6, 7]
        itr1.add(999); // [100, 1, 200, 999, 3, 4, 5, 6, 7]
        System.out.println(itr1.next()); // 3
        itr1.remove(); // [100, 1, 200, 999, 4, 5, 6, 7]
        System.out.println();
        System.out.println(itr1.hasPrevious()); // true
        System.out.println(list); // [100, 1, 200, 999, 4, 5, 6, 7]
        System.out.println();

        // remove element removeIf condition looping
        list.removeIf(a -> a % 2 == 0);
        System.out.println(list); // [1, 999, 5, 7]

    }
}
