import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers =
                new ArrayList<>(Arrays.asList(1, -23, 56, -4, 0, -22, 10));
//        UniSort.sort(
//                integers,
//                (o1, o2) -> (Integer)o1 - (Integer)o2
//        );
        QuickSorting.sort(
                integers,
                (o1, o2) -> (Integer)o1 - (Integer)o2
        );
        integers.forEach(System.out::println);

        List<String> strings =
                new ArrayList<>(Arrays.asList("Przemek", "Bill", "Maria", "Mykola", "John"));
//        UniSort.sort(
//                strings,
//                (o1, o2) -> ((String)o1).compareTo((String) o2)
//        );
        QuickSorting.sort(
                strings,
                (o1, o2) -> ((String) o1).compareTo((String) o2)
        );
        strings.forEach(System.out::println);

        List<Students> students =
                new ArrayList<>(Arrays.asList(
                        new Students("John", 27),
                        new Students("Bill", 25),
                        new Students("Maria", 33),
                        new Students("Mykola", 20),
                        new Students("Przemek", 19)));
//        UniSort.sort(
//                students,
//                (o1, o2) -> ((Students)o1).getAge() - ((Students)o2).getAge()
//        );
        QuickSorting.sort(
                students,
                (o1, o2) -> ((Students) o1).getAge() - ((Students) o2).getAge()
        );
        students.forEach(System.out::println);
    }
}
