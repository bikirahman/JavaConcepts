import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcept {
    public static void main(String[] args) {
        
        List<Integer> sList = Arrays.asList(45,78,96,47,85);

        sList.forEach(n->System.out.println(n));

        //Stream s1 = sList.stream();

        List<Integer> num = sList.stream()
                .filter(n -> n % 2 == 0) // filter even numbers
                .map(n -> n * 2) // double the values
                .collect(Collectors.toList()); // collect as List


        System.out.println(num);

    }
}
