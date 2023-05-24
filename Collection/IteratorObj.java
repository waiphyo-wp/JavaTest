package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorObj {
    public static void main(String[] args) {
        // create Set obj
        var set = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9));
        remveEven(set);
        System.out.println(set);
    }

    static void remveEven(Collection<Integer> collection) {
        Iterator<Integer> itr = collection.iterator(); // return Iterator Obj
        
        while (itr.hasNext()) {
            Integer data = itr.next();// get element 1
            if (data % 2 == 0) {
                itr.remove();
            }
        }
    }
}
