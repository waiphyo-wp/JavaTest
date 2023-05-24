package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
public class ComparableInterface {
    public static void main(String[] args) {
        // assign value
        var set = Set.of(new Data("BB"), new Data("CC"), new Data("AA"));

        // use comparable interface
        System.out.println(Collections.min(set));
        System.out.println(Collections.max(set));

        var list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list); // [AA, BB, CC]

        // use comparator interface to customize max, min, sort
        // var reverseSet = Set.of(new DataReverseComparator(), new DataReverseComparator());
        System.out.println(Collections.min(set, new DataReverseComparator()));
        System.out.println(Collections.max(set, new DataReverseComparator()));
        
        // Sorting
        Collections.sort(list, new DataReverseComparator());
        System.out.println(list); // [CC, BB, AA]

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // [CC, BB, AA]
        Collections.sort(list, Collections.reverseOrder(new DataReverseComparator()));
        System.out.println(list); // [AA, BB, CC]
        
        // Shuffle order
        Collections.shuffle(list);
        System.out.println(list); // [BB, CC, AA]

    }
}

class DataReverseComparator implements Comparator<Data> {

    // must override compare()
    @Override
    public int compare(Data d1, Data d2) {
        if (d1 == null) {
            return 1;
        }
        if (d2 == null) {
            return -1;
        }
        return d2.compareTo(d1); // reverse
    }
}

class Data implements Comparable<Data> {

    private String value;

    Data(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    // we can use max min after written compareTo()
    @Override
    public int compareTo(Data data) {
        if (value != null) {
            return this.value.compareTo(data.value); // 1 or -1 or 0
        }
        return 1;
    }
}
