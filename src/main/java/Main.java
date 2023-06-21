import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = RandomList.getIntegerArrayList(10);
        Service serv = new Service();

        System.out.println(integerList);
        System.out.println(serv.averageValue(integerList));
        System.out.println(serv.averageValue(Arrays.asList(1, 2, 3, 4, 5)));

        List<String> stringList = Arrays.asList("one", "two", "three");
        System.out.println(serv.getPairList(stringList));

        stringList = Arrays.asList("Clock", "Banana", "Time", "date", "lamp");
        System.out.println(serv.printLowerCaseLengthFour(stringList));
    }

}
