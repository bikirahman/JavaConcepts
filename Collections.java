import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        // Using ArrayList to create a collection of integers
        Collection<Integer> collection1 = new ArrayList<Integer>();
        collection1.add(54);
        collection1.add(7);
        collection1.add(10);

        for (Integer integer : collection1) {
            System.out.println(integer);
        }

        System.out.println("------------------------------------------");

        // Using HashSet to create a collection of integers
        // HashSet doesn't maintain the order of elements and doesn't allow duplicates
        Set<Integer> collection2 = new HashSet<Integer>();
        collection2.add(5);
        collection2.add(70);
        collection2.add(10);
        collection2.add(5);

        for (Integer integer : collection2) {
            System.out.println(integer);
        }

        System.out.println("------------------------------------------");

        // Using TreeSet to create a collection of integers
        // TreeSet maintains the order of elements and doesn't allow duplicates
        Set<Integer> collection3 = new TreeSet<Integer>();
        collection3.add(5);
        collection3.add(70);
        collection3.add(10);
        collection3.add(5);

        for (Integer integer : collection3) {
            System.out.println(integer);
        }

        System.out.println("------------------------------------------");

        // Using an iterator to iterate through elements of a collection
        Iterator<Integer> iterator = collection3.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator : " + iterator.next());
        }
    }
}
